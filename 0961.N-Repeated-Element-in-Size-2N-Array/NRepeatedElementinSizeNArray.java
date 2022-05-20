import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 5/21/22 7:49 AM
 */
public class NRepeatedElementinSizeNArray {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.get(num) != null) {
                return num;
            } else {
                map.put(num, 1);
            }
        }

        return -1;
    }
}
