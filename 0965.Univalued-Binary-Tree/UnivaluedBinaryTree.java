/**
 * @author Delete020
 * @since 5/24/22 9:25 PM
 */
public class UnivaluedBinaryTree {
    int val;

    public boolean isUnivalTree(TreeNode root) {
        val = root.val;
        return help(root);
    }

    private boolean help(TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.val != val) {
            return false;
        }
        return help(node.right) && help(node.left);
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
