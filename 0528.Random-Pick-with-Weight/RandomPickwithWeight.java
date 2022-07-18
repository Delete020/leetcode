import java.util.Random;

/**
 * @author Delete020
 * @since 07/18/22 20:46 PM
 */
public class RandomPickwithWeight {
    int[] preSum;
    int max;
    Random r;

    public RandomPickwithWeight(int[] w) {
        preSum = new int[w.length + 1];
        for (int i = 0; i < w.length; i++) {
            preSum[i + 1] = w[i] + preSum[i];
        }
        max = preSum[w.length];
        r = new Random();
    }

    public int pickIndex() {
        int num = r.nextInt(max);
        int left = 0;
        int right = preSum.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (preSum[mid] <= num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }
}