import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/27/22 9:06 PM
 */
public class SubsetsII {
    List<List<Integer>> res;
    LinkedList<Integer> ans;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        ans = new LinkedList<>();
        Arrays.sort(nums);
        backtrack(nums, 0);
        return res;
    }

    private void backtrack(int[] nums, int start) {
        res.add(new ArrayList<>(ans));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            ans.add(nums[i]);
            backtrack(nums, i + 1);
            ans.removeLast();
        }
    }
}
