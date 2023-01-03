/**
 * @author Delete020
 * @since 01/03/23 18:26 PM
 */
public class CheckifNumbersAreAscendinginaSentence {
    public boolean areNumbersAscending(String s) {
        int pre = 0;
        for (String st : s.split(" ")) {
            try {
                int cur = Integer.parseInt(st);
                if (cur <= pre) return false;
                pre = cur;
            } catch (Exception ignored) {
            }
        }
        return true;
    }
}