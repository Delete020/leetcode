/**
 * @author Delete020
 * @since 10/27/22 20:01 PM
 */
public class SignoftheProductofanArray {
    public int arraySign(int[] nums) {
        boolean f = true;
        for (int i : nums) {
            if (i == 0) return 0;
            if (i < 0) f = !f;
        }
        return f ? 1 : -1;
    }
}