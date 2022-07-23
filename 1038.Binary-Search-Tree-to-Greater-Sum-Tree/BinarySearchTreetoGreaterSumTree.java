/**
 * @author Delete020
 * @since 07/23/22 23:09 PM
 */
public class BinarySearchTreetoGreaterSumTree {
    int val = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;
        bstToGst(root.right);
        root.val += val;
        val = root.val;
        bstToGst(root.left);
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