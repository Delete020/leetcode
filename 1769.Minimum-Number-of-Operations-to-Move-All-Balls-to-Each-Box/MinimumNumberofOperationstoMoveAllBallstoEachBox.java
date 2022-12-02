/**
 * @author Delete020
 * @since 12/02/22 20:33 PM
 */
public class MinimumNumberofOperationstoMoveAllBallstoEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (boxes.charAt(i - 1) == '1') cnt++;
            ans[i] = ans[i - 1] + cnt;
        }

        cnt = 0;
        int pre = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (boxes.charAt(i + 1) == '1') cnt++;
            pre += cnt;
            ans[i] += pre;
        }
        return ans;
    }
}