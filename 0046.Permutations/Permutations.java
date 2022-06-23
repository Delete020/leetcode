import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/23/22 8:20 PM
 */
public class Permutations {
    List<List<Integer>> res;
    int size;
    boolean[] visited;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        size = nums.length;
        visited = new boolean[size];
        LinkedList<Integer> list = new LinkedList<>();

        help(nums, list);
        return res;
    }

    private void help(int[] nums, LinkedList<Integer> list) {
        if (list.size() == size) {
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            help(nums, list);
            visited[i] = false;
            list.removeLast();
        }
    }
}
