import java.util.Arrays;

/**
 * @author Delete020
 * @since 08/10/22 21:06 PM
 */
public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 0;
        int n = citations.length;
        for (int i = 0; i < n; ) {
            if (citations[n - 1 - i] < ++i) {
                break;
            }
            res = i;
        }
        return res;
    }
}