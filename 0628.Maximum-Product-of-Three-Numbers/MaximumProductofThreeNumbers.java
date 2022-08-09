/**
 * @author Delete020
 * @since 08/09/22 21:44 PM
 */
public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        int fir = -1111;
        int sec = -1111;
        int thr = -1111;
        int minFir = 1111;
        int minSec = 1111;

        for (int num : nums) {
            if (num >= fir) {
                thr = sec;
                sec = fir;
                fir = num;
            } else if (num >= sec) {
                thr = sec;
                sec = num;
            } else if (num > thr) {
                thr = num;
            }

            if (minFir >= num) {
                minSec = minFir;
                minFir = num;
            } else if (minSec > num) {
                minSec = num;
            }
        }

        return Math.max(fir * sec * thr, fir * minSec * minFir);
    }
}