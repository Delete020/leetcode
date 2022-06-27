import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/27/22 9:03 PM
 */
public class Subsets {
    List<List<Integer>> res;
    LinkedList<Integer> ans;
    int[] nums;
    int n;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        ans = new LinkedList<>();
        res.add(new ArrayList<>());
        this.nums = nums;
        n = nums.length;
        backtrack(0);
        return res;
    }

    private void backtrack(int start) {
        for (int i = start; i < n; i++) {
            ans.add(nums[i]);
            res.add(new ArrayList<>(ans));
            backtrack(i + 1);
            ans.removeLast();
        }
    }
}
