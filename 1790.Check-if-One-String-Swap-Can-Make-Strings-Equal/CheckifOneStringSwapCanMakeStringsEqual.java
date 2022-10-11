/**
 * @author Delete020
 * @since 10/11/22 21:01 PM
 */
public class CheckifOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt = 0;
        char[] diff = new char[2];
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (++cnt > 2) return false;
                if (cnt == 1) {
                    diff[0] = s1.charAt(i);
                    diff[1] = s2.charAt(i);
                } else if (s1.charAt(i) != diff[1] || s2.charAt(i) != diff[0]) {
                    return false;
                }
            }
        }
        return cnt != 1;
    }
}