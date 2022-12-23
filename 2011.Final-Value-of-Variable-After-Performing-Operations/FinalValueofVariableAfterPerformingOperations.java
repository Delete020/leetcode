/**
 * @author Delete020
 * @since 12/23/22 18:42 PM
 */
public class FinalValueofVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                ++ans;
            } else {
                --ans;
            }
        }
        return ans;
    }
}