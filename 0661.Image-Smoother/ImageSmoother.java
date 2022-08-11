/**
 * @author Delete020
 * @since 08/11/22 21:08 PM
 */
public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                double sum = 0;
                int cnt = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    if (k < 0 || k >= m) continue;
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (l < 0 || l >= n) continue;
                        cnt++;
                        sum += img[k][l];
                    }
                }
                res[i][j] = (int) (sum / cnt);
            }
        }

        return res;
    }
}