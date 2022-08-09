/**
 * @author Delete020
 * @since 08/09/22 21:46 PM
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int fir = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int thr = Integer.MIN_VALUE;
        int f = 0;
        boolean flag = true;

        for (int num : nums) {
            if (flag && num == Integer.MIN_VALUE) {
                flag = false;
                f++;
            }

            if (num >= fir) {
                if (num == fir) continue;
                f++;
                thr = sec;
                sec = fir;
                fir = num;
            } else if (num >= sec) {
                if (num == sec) continue;
                f++;
                thr = sec;
                sec = num;
            } else if (num >= thr) {
                f++;
                thr = num;
            }
        }

        return f >= 3 ? thr : fir;
    }
}