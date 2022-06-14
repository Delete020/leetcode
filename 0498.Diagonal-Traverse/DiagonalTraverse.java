/**
 * @author Delete020
 * @since 6/14/22 10:23 PM
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];

        int count = 0;
        boolean flag = true;
        for (int i = 0; i < m + n; i++) {
            int pm = flag ? m : n;
            int pn = flag ? n : m;

            int x = i < pm ? i : pm - 1;
            int y = i - x;

            while (x >= 0 && y < pn) {
                res[count++] = flag ? mat[x--][y++] : mat[y++][x--];
            }

            flag = !flag;
        }

        return res;
    }
}
