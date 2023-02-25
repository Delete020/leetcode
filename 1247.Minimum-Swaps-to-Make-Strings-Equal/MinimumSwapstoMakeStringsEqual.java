/**
 * @author Delete020
 * @since 02/25/23 21:00 PM
 */
public class MinimumSwapstoMakeStringsEqual {
    public int minimumSwap(String s1, String s2) {
        int n = s1.length();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if (c1[i] != c2[i]) {
                if (c1[i] == 'x') x++;
                else y++;
            }
        }
        return (x + y) % 2 == 1 ? -1 : (x + 1) / 2 + (y + 1) / 2;
    }
}