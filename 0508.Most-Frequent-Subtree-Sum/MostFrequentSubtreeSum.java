import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 6/19/22 1:15 PM
 */
public class MostFrequentSubtreeSum {
    Map<Integer, Integer> map;
    int max = 1;

    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();
        preorder(root);
        List<Integer> list = map.keySet().stream().filter(k -> map.get(k) == max).toList();
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    private int preorder(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = root.val + preorder(root.left) + preorder(root.right);
        int count = map.getOrDefault(sum, 0) + 1;
        map.put(sum, count);
        max = Math.max(max, count);

        return sum;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
