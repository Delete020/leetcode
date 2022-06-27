import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/27/22 9:00 PM
 */
public class CombinationSumII {
    List<List<Integer>> res;
    LinkedList<Integer> ans;
    int[] candidates;
    int n;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        ans = new LinkedList<>();
        Arrays.sort(candidates);
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
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            ans.add(candidates[i]);
            backtrack(target - candidates[i], i + 1);
            ans.removeLast();
        }
    }
}
