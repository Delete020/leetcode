import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 6/1/22 2:07 PM
 */
public class DfsBinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> list, int index) {
        if (root == null) {
            return;
        }
        if (list.size() == index) {
            list.add(index, root.val);
        }

        dfs(root.right, list, ++index);
        dfs(root.left, list, index);
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
