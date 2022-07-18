/**
 * @author Delete020
 * @since 07/18/22 21:01 PM
 */
public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 1;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = (left + right) >> 1;
            if (getDays(weights, mid) <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private int getDays(int[] weights, int capacity) {
        int days = 0;
        for (int i = 0; i < weights.length; ) {
            int cap = capacity;
            while (i < weights.length) {
                if (cap < weights[i]) break;
                cap -= weights[i];
                i++;
            }
            days++;
        }
        return days;
    }
}