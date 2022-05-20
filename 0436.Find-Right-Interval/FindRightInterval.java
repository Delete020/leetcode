import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Delete020
 * @since 5/20/22 11:00 PM
 */
public class FindRightInterval {
    public int[] findRightInterval(int[][] intervals) {
        int m = intervals.length;
        int n = intervals[0].length;
        int[][] sorted = new int[m][n];
        for (int i = 0; i < m; i++) {
            sorted[i][0] = intervals[i][0];
            sorted[i][1] = i;
        }
        Arrays.sort(sorted, Comparator.comparingInt(x -> x[0]));

        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = m - 1;
            int rightSide = intervals[i][1];

            while (left < right) {
                int mid = (right - left) / 2 + left;
                if (sorted[mid][0] >= rightSide) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            if (sorted[right][0] < rightSide) {
                res[i] = -1;
            } else {
                res[i] = sorted[right][1];
            }
        }

        return res;
    }
}
