/**
 * @author Delete020
 * @since 07/06/22 22:20 PM
 */
public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] need = new int[26];
        int[] window = new int[26];
        char A = 'a';
        for (char c : p.toCharArray()) {
            need[c - A]--;
        }

        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - A;
            need[c]++;
            while (need[c] > 0) {
                need[s.charAt(left++) - A]--;
            }
            if (i - left + 1 == p.length()) {
                res.add(left);
            }
        }

        return res;
    }

    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int cnt = 0;
        int size = need.size();
        int length = p.length();

        for (char c : s.toCharArray()) {
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    cnt++;
                }
            }

            while (cnt == size) {
                if (right - left == length) {
                    res.add(left);
                }
                char ch = s.charAt(left++);
                if (need.containsKey(ch)) {
                    if (window.get(ch).equals(need.get(ch))) {
                        cnt--;
                    }
                    window.put(ch, window.get(ch) - 1);
                }
            }
        }

        return res;
    }
}