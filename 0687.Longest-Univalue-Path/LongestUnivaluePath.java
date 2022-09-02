/**
 * @author Delete020
 * @since 09/02/22 08:06 AM
 */
public class LongestUnivaluePath {
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        help(root);
        return max;
    }

    public int help(TreeNode root) {
        if (root == null) return 0;
        int left = help(root.left);
        int right = help(root.right);
        int ansLeft = 0;
        int ansRight = 0;
        if (root.left != null && root.val == root.left.val) {
            ansLeft = left + 1;
        }
        if (root.right != null && root.val == root.right.val) {
            ansRight = right + 1;
        }
        max = Math.max(max, ansRight + ansLeft);
        return Math.max(ansLeft, ansRight);
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