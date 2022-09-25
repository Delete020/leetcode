/**
 * @author Delete020
 * @since 09/25/22 21:51 PM
 */
public class RotatedDigits {
    public int rotatedDigits(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            boolean ok = false;
            int x = i;
            while (x != 0) {
                int t = x % 10;
                x /= 10;
                if (t == 2 || t == 5 || t == 6 || t == 9) ok = true;
                else if (t != 0 && t != 1 && t != 8) {
                    ok = false;
                    break;
                }
            }
            if (ok) ans++;
        }
        return ans;
    }
}