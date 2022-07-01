/**
 * @author Delete020
 * @since 07/01/22 22:05 PM
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];

        for (int price : prices) {
            max = Math.max(price - min, max);
            min = Math.min(min, price);
        }

        return max;
    }
}