/**
 * @author Delete020
 * @since 5/18/22 10:57 PM
 */
public class KthSmallestNumberInMultiplicationTable {
    public int findKthNumber(int m, int n, int k) {
        int left = 1;
        int right = m * n;

        while (left < right) {
            int mid = (left * right) / 2 + left;
            if (count(mid, m, n) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int count(int mid, int m, int n) {
        int res = 0;
        for (int i = 1; i <= m; i++) {
            res += Math.min(mid / i, n);
        }
        return res;
    }
}
