/**
 * @author Delete020
 * @since 11/23/22 23:31 PM
 */
public class MaximumNumberofBallsinaBox {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int k = 0;
            int cur = i;
            while (cur != 0) {
                k += cur % 10;
                cur /= 10;
            }
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        int ans = 0;
        for (int i : map.values()) ans = Math.max(ans, i);
        return ans;
    }
}