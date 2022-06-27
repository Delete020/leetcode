import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/27/22 8:55 PM
 */
public class CombinationSum {
    List<List<Integer>> res;
    LinkedList<Integer> ans;
    int[] candidates;
    int n;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        ans = new LinkedList<>();
        this.candidates = candidates;
        n = candidates.length;
        backtrack(target, 0);
        return res;
    }

    private void backtrack(int target, int index) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = index; i < n; i++) {
            ans.add(candidates[i]);
            backtrack(target - candidates[i], i);
            ans.removeLast();
        }
    }
}
