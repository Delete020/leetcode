/**
 * @author Delete020
 * @since 6/21/22 9:51 PM
 */
public class DiameterofBinaryTree {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        postorder(root);
        return max;
    }

    private int postorder(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxLeft = postorder(root.left);
        int maxRight = postorder(root.right);
        max = Math.max(max, maxLeft + maxRight);

        return 1 + Math.max(maxLeft, maxRight);
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
