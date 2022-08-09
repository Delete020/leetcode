/**
 * @author Delete020
 * @since 08/09/22 21:43 PM
 */
public class TeAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int next = 0;
        int res = 0;
        for (int time : timeSeries) {
            res += duration;
            if (next > time) {
                res += time - next;
            }
            next = time + duration;
        }
        return res;
    }
}