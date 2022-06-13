import java.util.Arrays;

/**
 * @author Delete020
 * @since 6/13/22 10:07 AM
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] copy = heights.clone();
        Arrays.sort(copy);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) {
                res++;
            }
        }
        return res;
    }
}
