import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Delete020
 * @since 03/23/23 22:34 PM
 */
public class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = l.length;
        List<Boolean> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int[] array = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(array);
            int pre = array[1] - array[0];
            boolean f = true;
            for (int j = 2; j < array.length; j++) {
                if (array[j] - array[j - 1] != pre) {
                    f = false;
                    break;
                }
            }
            ans.add(f);
        }
        return ans;
    }
}