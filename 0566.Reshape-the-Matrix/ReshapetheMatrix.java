/**
 * @author Delete020
 * @since 08/16/22 20:25 PM
 */
public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (r * c != m * n) return mat;

        int[][] res = new int[r][c];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[index / c][(index++) % c] = mat[i][j];
            }
        }

        return res;
    }
}