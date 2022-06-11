/**
 * @author Delete020
 * @since 6/11/22 1:47 PM
 */
public class FlipStringtoMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int one = 0;
        int zero = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                one = Math.min(one, zero) + 1;
            } else {
                one = Math.min(one, zero);
                zero += 1;
            }
        }

        return Math.min(one, zero);
    }
}
