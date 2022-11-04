/**
 * @author Delete020
 * @since 11/04/22 23:56 PM
 */
public class ReachaNumber {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int dis = 0;
        int cnt = 0;
        while (dis < target) {
            cnt++;
            dis += cnt;
        }
        if ((dis - target) % 2 == 0) return cnt;
        return cnt % 2 == 0 ? cnt + 1 : cnt + 2;
    }
}