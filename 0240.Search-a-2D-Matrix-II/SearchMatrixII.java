/**
 * @author cancel
 * @since 5/15/22 5:34 PM
 */
public class SearchMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int j = matrix[0].length - 1;
        int i = 0;

        while (i < m && j >= 0) {
            int curr = matrix[i][j];
            if (curr > target) {
                j--;
            } else if (curr != target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
