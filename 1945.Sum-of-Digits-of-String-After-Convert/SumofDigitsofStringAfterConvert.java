/**
 * @author Delete020
 * @since 12/15/22 17:11 PM
 */
public class SumofDigitsofStringAfterConvert {
    public int getLucky(String s, int k) {
        int ans = 0;
        for (char c : s.toCharArray()) {
            int i = c - 'a' + 1;
            ans += i / 10 + i % 10;
        }
        while (--k > 0) {
            int temp = ans;
            ans = 0;
            while (temp > 0) {
                ans += temp % 10;
                temp /= 10;
            }
        }
        return ans;
    }
}