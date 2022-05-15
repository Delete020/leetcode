/**
 * @since 5/15/22 5:39 PM
 */
public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double res = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                for (int k = 0; k < j; ++k) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
                    double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
                    double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
                    double p = (a + b + c) / 2;
                    double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                    if (Double.isNaN(s)) {
                        continue;
                    }
                    res = Math.max(res, s);
                }
            }
        }
        return res;
    }
}
