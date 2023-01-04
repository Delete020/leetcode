/**
 * @author Delete020
 * @since 01/04/23 21:34 PM
 */
public class MaximumValueataGivenIndexinaBoundedArray {
    public int maxValue(int n, int index, int maxSum) {
        long l = 1, r = maxSum;
        while (l < r) {
            long mid = (l + r + 1) >> 1;
            if (sum(n, index, mid, maxSum)) r = mid - 1;
            else l = mid;
        }
        return (int) l;
    }

    private boolean sum(int n, int index, long m, int maxSum) {
        long sum = (m - 1) >= index ? index * ((m << 1) - 1 - index) / 2 : (m - 1) * m / 2 + index - m + 1;
        index = n - index - 1;
        sum += (m - 1) >= index ? index * ((m << 1) - 1 - index) / 2 : (m - 1) * m / 2 + index - m + 1;
        return sum + m > maxSum;
    }
}