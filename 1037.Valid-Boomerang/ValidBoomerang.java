/**
 * @author Delete020
 * @since 6/8/22 8:50 PM
 */
public class ValidBoomerang {
    public boolean isBoomerang(int[][] points) {
        int[] a = new int[]{points[1][0] - points[0][0], points[1][1] - points[0][1]};
        int[] b = new int[]{points[2][0] - points[0][0], points[2][1] - points[0][1]};
        return a[0] * b[1] != a[1] * b[0];
    }
}
