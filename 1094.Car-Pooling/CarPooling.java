/**
 * @author Delete020
 * @since 07/13/22 20:57 PM
 */
public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] sum = new int[1001];
        for (int[] trip : trips) {
            sum[trip[1]] += trip[0];
            sum[trip[2]] -= trip[0];
        }
        int[] res = new int[1001];
        for (int i = 1; i < 1001; i++) {
            res[i] = res[i - 1] + sum[i - 1];
            if (res[i] > capacity) return false;
        }
        return true;
    }
}