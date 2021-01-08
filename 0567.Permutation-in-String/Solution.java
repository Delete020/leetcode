public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0, right = 0, cnt = 0;
        int[] need = new int[26];
        int[] require = new int[26];

        for (char c : s1.toCharArray()) {
            need[c - 'a'] += 1;
        }

        while (right < s2.length()) {
            int c = s2.charAt(right) - 'a';
            if (need[c] != 0) {
                require[c] += 1;
                if (need[c] >= require[c]) {
                    cnt += 1;
                }
            }

            while (cnt == s1.length()) {
                if (right - left + 1 == s1.length()) {
                    return true;
                }

                int head = s2.charAt(left) - 'a';
                if (need[head] != 0) {
                    require[head] -= 1;
                }
                if (need[head] > require[head]) {
                    cnt -= 1;
                }
                left += 1;
            }

            right += 1;
        }

        return false;
    }
}
