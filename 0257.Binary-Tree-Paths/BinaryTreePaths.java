import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/25/22 6:57 PM
 */
public class BinaryTreePaths {
    private List<String> res;

    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<>();
        help(root, "");
        return res;
    }

    private void help(TreeNode root, String s) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            res.add(s + root.val);
            return;
        }
        s += root.val + "->";
        help(root.left, s);
        help(root.right, s);
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
