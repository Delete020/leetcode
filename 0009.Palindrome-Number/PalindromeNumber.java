/**
 * @author Delete020
 * @since 07/22/22 23:55 PM
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int xx = 0;
        int xxx = x;
        while (x != 0) {
            xx = xx * 10 + x % 10;
            x /= 10;
        }
        return xxx == xx;
    }
}