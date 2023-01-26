import java.util.Arrays;

/**
 * @author Delete020
 * @since 01/26/23 15:22 PM
 */
public class SmallestStringWithAGivenNumericValue {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        Arrays.fill(ans, 'a');
        k -= n;
        for (int i = n - 1; i >= 0 && k > 0; i--) {
            if (k >= 25) ans[i] += 25;
            else ans[i] += k;
            k -= 25;
        }
        return new String(ans);
    }
}