/**
 * @author Delete020
 * @since 08/17/22 21:37 PM
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean removeFirstRow = false;
        boolean removeFirstCol = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) removeFirstCol = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
            if (i == 0 && matrix[0][0] == 0) removeFirstRow = true;
        }

        for (int i = 1; i < n; i++) {
            if (matrix[0][i] == 0) {
                int j = 1;
                while (j < m) {
                    matrix[j++][i] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                matrix[i] = new int[n];
            }
        }

        if (removeFirstCol) {
            int j = 1;
            while (j < m) {
                matrix[j++][0] = 0;
            }
        }

        if (removeFirstRow) {
            matrix[0] = new int[n];
        }
    }
}