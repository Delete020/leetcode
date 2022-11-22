/**
 * @author Delete020
 * @since 11/22/22 21:33 PM
 */
public class NthMagicalNumber {
    public int nthMagicalNumber(int n, int a, int b) {
        int mod = (int) 1e9 + 7;
        int lcm = a * b / gcd(a, b);
        long l = 0;
        long r = (long) 1e18;
        while (l < r) {
            long mid = (l + r) >> 1;
            long cnt = mid / a + mid / b - mid / lcm;
            if (cnt >= n) r = mid;
            else l = mid + 1;
        }
        return (int) (l % mod);
    }

    private int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }
}