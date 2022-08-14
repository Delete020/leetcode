/**
 * @author Delete020
 * @since 08/14/22 10:26 AM
 */
public class MaximumScoreAfterSplittingaString {
    public int maxScore(String s) {
        char[] c = s.toCharArray();
        int res = 0;
        int sum1 = 0;
        int sum0 = 0;
        for (char ch : c) {
            if (ch == '1') sum1++;
        }
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == '0') {
                sum0++;
            } else {
                sum1--;
            }
            res = Math.max(res, sum0 + sum1);
        }
        return res;
    }
}