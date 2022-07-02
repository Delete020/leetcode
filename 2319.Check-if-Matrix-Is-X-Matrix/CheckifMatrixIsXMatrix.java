/**
 * @author Delete020
 * @since 07/02/22 22:29 PM
 */
public class CheckifMatrixIsXMatrix {
    public boolean checkXMatrix(int[][] grid) {
        int length = grid[0].length;
        int start = 0;
        int n = length - 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == start || j == n) {
                    continue;
                }
                if (grid[i][j] != 0) {
                    return false;
                }
            }

            if (grid[i][start] == 0 || grid[i][n] == 0) {
                return false;
            }
            start++;
            n--;
        }
        return true;
    }
}