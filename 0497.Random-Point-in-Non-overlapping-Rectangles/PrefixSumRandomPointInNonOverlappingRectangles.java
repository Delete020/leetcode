import java.util.Random;

/**
 * @author Delete020
 * @since 6/9/22 11:22 PM
 */
public class PrefixSumRandomPointInNonOverlappingRectangles {
    int[][] rects;
    int[] pre;
    int length;
    Random random = new Random();

    public PrefixSumRandomPointInNonOverlappingRectangles(int[][] rects) {
        this.rects = rects;
        pre = new int[rects.length + 1];
        length = 0;
        for (int[] rect : rects) {
            pre[length + 1] = pre[length++] + (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1);
        }
    }

    public int[] pick() {
        int val = random.nextInt(pre[length]) + 1;
        int left = 1;
        int right = length;

        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (pre[mid] < val) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int[] rect = rects[--right];
        return new int[]{rect[0] + random.nextInt(rect[2] - rect[0] + 1), rect[1] + random.nextInt(rect[3] - rect[1] + 1)};
    }
}
