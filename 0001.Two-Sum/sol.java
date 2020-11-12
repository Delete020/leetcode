import java.util.Hashtable;
import java.util.Map;

public class sol {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new Hashtable<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = table.get(target - nums[i]);
                break;
            }
            table.put(nums[i], i);
        }

        return result;
    }
}
