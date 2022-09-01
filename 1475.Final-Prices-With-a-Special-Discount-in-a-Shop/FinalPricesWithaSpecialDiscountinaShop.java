/**
 * @author Delete020
 * @since 09/01/22 20:21 PM
 */
public class FinalPricesWithaSpecialDiscountinaShop {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (++j < n && prices[j] > prices[i]) {
            }
            if (j < n) {
                prices[i] -= prices[j];
            }
        }
        return prices;
    }
}