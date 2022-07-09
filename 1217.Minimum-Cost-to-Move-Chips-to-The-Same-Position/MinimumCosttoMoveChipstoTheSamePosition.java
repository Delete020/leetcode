/**
 * @author Delete020
 * @since 07/09/22 20:14 PM
 */
public class MinimumCosttoMoveChipstoTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int cnt = 0;
        for (int i : position) {
            cnt += i % 2;
        }
        return Math.min(position.length - cnt, cnt);
    }
}