import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 5/22/22 4:25 PM
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        while (!list.isEmpty()) {
            List<TreeNode> next = new ArrayList<>();

            for (TreeNode node : list) {
                swap(node);
                if (node.left != null) {
                    next.add(node.left);
                }
                if (node.right != null) {
                    next.add(node.right);
                }
            }
            list = next;
        }

        return root;
    }

    private void swap(TreeNode p) {
        TreeNode temp = p.left;
        p.left = p.right;
        p.right = temp;
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
