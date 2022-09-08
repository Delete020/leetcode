/**
 * @author Delete020
 * @since 09/08/22 19:54 PM
 */
public class BeautifulArrangementII {
    public int[] constructArray(int n, int k) {
        int r = k + 1;
        int l = 1;
        int[] ans = new int[n];
        for (int i = 0; i <= k; i += 2) {
            ans[i] = l++;
        }
        for (int i = 1; i <= k; i += 2) {
            ans[i] = r--;
        }
        for (int i = k + 1; i < n; ) {
            ans[i] = ++i;
        }
        return ans;
    }
}