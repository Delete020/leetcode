/**
 * @author Delete020
 * @since 07/14/22 21:51 PM
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int upper = 0;
        int lower = n - 1;
        int left = 0;
        int right = n - 1;
        int index = 1;

        while (index <= n * n) {
            if (upper <= lower) {
                for (int i = left; i <= right; i++) {
                    res[upper][i] = index++;
                }
                upper++;
            }
            if (left <= right) {
                for (int i = upper; i <= lower; i++) {
                    res[i][right] = index++;
                }
                right--;
            }
            if (upper <= lower) {
                for (int i = right; i >= left; i--) {
                    res[lower][i] = index++;
                }
                lower--;
            }
            if (left <= right) {
                for (int i = lower; i >= upper; i--) {
                    res[i][left] = index++;
                }
                left++;
            }
        }
        return res;
    }
}