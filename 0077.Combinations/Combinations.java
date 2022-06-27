import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/27/22 9:05 PM
 */
public class Combinations {
    List<List<Integer>> res;
    LinkedList<Integer> ans;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        ans = new LinkedList<>();
        backtrack(n, k, 1);
        return res;
    }

    private void backtrack(int n, int k, int start) {
        if (ans.size() == k) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = start; i <= n; i++) {
            ans.add(i);
            backtrack(n, k, i + 1);
            ans.removeLast();
        }
    }
}
