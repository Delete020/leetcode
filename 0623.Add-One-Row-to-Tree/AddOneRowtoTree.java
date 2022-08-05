/**
 * @author Delete020
 * @since 08/05/22 20:53 PM
 */
public class AddOneRowtoTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return help(root, val, depth, 1, true);
    }

    public TreeNode help(TreeNode root, int val, int depth, int currentDepth, boolean isLeft) {
        if (currentDepth == depth) {
            return isLeft ? new TreeNode(val, root, null) : new TreeNode(val, null, root);
        }
        if (root == null) return null;

        root.left = help(root.left, val, depth, currentDepth + 1, true);
        root.right = help(root.right, val, depth, currentDepth + 1, false);
        return root;
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