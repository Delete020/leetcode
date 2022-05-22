import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 5/22/22 3:20 PM
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> curr = new ArrayList<>();
        curr.add(root);

        while (!curr.isEmpty()) {
            List<TreeNode> next = new ArrayList<>();
            List<Integer> list = new ArrayList<>();

            for (TreeNode node : curr) {
                list.add(node.val);
                if (node.left != null) {
                    next.add(node.left);
                }
                if (node.right != null) {
                    next.add(node.right);
                }
            }
            res.add(list);
            curr = next;
        }

        return res;
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
