import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 07/21/22 21:52 PM
 */
public class FindDuplicateSubtrees {
    Map<String, Integer> map;
    List<TreeNode> res;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap<>();
        res = new ArrayList<>();
        subtrees(root);
        return res;
    }

    private String subtrees(TreeNode root) {
        if (root == null) return "#";
        String s = subtrees(root.left) + subtrees(root.right) + root.val + "!";
        if (map.getOrDefault(s, 0) == 1) {
            res.add(root);
        }
        map.put(s, map.getOrDefault(s, 0) + 1);
        return s;
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