/**
 * @since 5/17/22 8:31 PM
 */
public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[order.length()];
        int i = 0;
        for (char c : order.toCharArray()) {
            index[c - 'a'] = i++;
        }

        for (i = 1; i < words.length; i++) {
            int s1Length = words[i - 1].length();
            int s2Length = words[i].length();
            for (int j = 0; j < Math.min(s1Length, s2Length); j++) {
                int w1 = index[words[i].charAt(j) - 'a'];
                int w2 = index[words[i - 1].charAt(j) - 'a'];
                if (w1 > w2) {
                    break;
                }
                if (w1 < w2) {
                    return false;
                } else if (j == Math.min(s1Length, s2Length) - 1 && s1Length > s2Length) {
                    return false;
                }
            }
        }

        return true;
    }
}
