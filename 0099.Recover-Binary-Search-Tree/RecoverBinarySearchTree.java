/**
 * @author Delete020
 * @since 09/21/22 20:17 PM
 */
public class RecoverBinarySearchTree {
    TreeNode error = null;
    TreeNode swap = null;
    TreeNode pre = null;

    public void recoverTree(TreeNode root) {
        travel(root);
        int temp = error.val;
        error.val = swap.val;
        swap.val = temp;
    }

    private void travel(TreeNode node) {
        if (node == null) return;
        travel(node.left);
        if (error != null && pre.val > node.val) {
            swap = node;
            return;
        }
        if (pre != null && pre.val > node.val) {
            error = pre;
            swap = node;
        }
        pre = node;
        travel(node.right);
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