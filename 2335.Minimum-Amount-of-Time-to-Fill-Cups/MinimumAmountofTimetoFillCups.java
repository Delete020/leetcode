import java.util.Arrays;

/**
 * @author Delete020
 * @since 02/11/23 21:37 PM
 */
public class MinimumAmountofTimetoFillCups {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[0] + amount[1] <= amount[2]) return amount[2];
        return (amount[0] + amount[1] + amount[2] + 1) / 2;
    }
}