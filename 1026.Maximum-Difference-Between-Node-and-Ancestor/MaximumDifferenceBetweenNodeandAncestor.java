/**
 * @author Delete020
 * @since 04/18/23 22:31 PM
 */
public class MaximumDifferenceBetweenNodeandAncestor {
    int ans;

    public int maxAncestorDiff(TreeNode root) {
        help(root, root.val, root.val);
        return ans;
    }

    private void help(TreeNode node, int max, int min) {
        if (node == null) return;
        max = Math.max(max, node.val);
        min = Math.min(min, node.val);
        ans = Math.max(ans, max - min);
        help(node.left, max, min);
        help(node.right, max, min);
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