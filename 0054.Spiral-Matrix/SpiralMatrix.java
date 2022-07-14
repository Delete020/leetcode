/**
 * @author Delete020
 * @since 07/14/22 21:50 PM
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int upper = 0;
        int lower = m - 1;
        int left = 0;
        int right = n - 1;
        List<Integer> res = new ArrayList<>();

        while (res.size() < m * n) {
            if (upper <= lower) {
                for (int i = left; i <= right; i++) {
                    res.add(matrix[upper][i]);
                }
                upper++;
            }
            if (left <= right) {
                for (int i = upper; i <= lower; i++) {
                    res.add(matrix[i][right]);
                }
                right--;
            }
            if (upper <= lower) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[lower][i]);
                }
                lower--;
            }
            if (left <= right) {
                for (int i = lower; i >= upper; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}