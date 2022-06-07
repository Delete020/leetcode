/**
 * @author Delete020
 * @since 6/7/22 4:08 PM
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1100000000;

        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (calTime(piles, mid) <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private int calTime(int[] piles, int speed) {
        int time = 0;
        for (int number : piles) {
            int hour = number / speed;
            if (speed * hour < number) {
                hour++;
            }
            time += hour;
        }
        return time;
    }
}
