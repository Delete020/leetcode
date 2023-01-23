/**
 * @author Delete020
 * @since 01/23/23 18:36 PM
 */
public class CalculateAmountPaidinTaxes {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0;
        int i = 0, n = brackets.length, pre = 0;
        while (income >= pre && i < n) {
            int tax = (Math.min(income, brackets[i][0])) - pre;
            pre = brackets[i][0];
            ans += tax / 100.0 * brackets[i][1];
            i++;
        }
        return ans;
    }
}