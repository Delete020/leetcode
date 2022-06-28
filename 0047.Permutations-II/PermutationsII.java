import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/28/22 10:11 PM
 */
public class PermutationsII {
    List<List<Integer>> res;
    LinkedList<Integer> ans;
    boolean[] visited;
    int n;

    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        ans = new LinkedList<>();
        n = nums.length;
        visited = new boolean[n];
        Arrays.sort(nums);
        backtrack(nums);
        return res;
    }

    private void backtrack(int[] nums) {
        if (ans.size() == n) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            if (i > 0 && !visited[i - 1] && nums[i] == nums[i - 1]) {
                continue;
            }
            ans.add(nums[i]);
            visited[i] = true;
            backtrack(nums);
            visited[i] = false;
            ans.removeLast();
        }
    }
}
