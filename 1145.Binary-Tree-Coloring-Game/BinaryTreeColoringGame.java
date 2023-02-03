/**
 * @author Delete020
 * @since 02/03/23 22:45 PM
 */
public class BinaryTreeColoringGame {
    int right = 0;
    int left = 0;

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        return traversal(root, x) / 2 < Math.max(Math.max(left, right), n - (left + right) - 1);
    }

    private int traversal(TreeNode root, int x) {
        if (root == null) return 0;
        int r = traversal(root.right, x);
        int l = traversal(root.left, x);
        if (root.val == x) {
            right = r;
            left = l;
        }
        return l + r + 1;
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