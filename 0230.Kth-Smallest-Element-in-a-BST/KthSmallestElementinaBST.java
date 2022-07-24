/**
 * @author Delete020
 * @since 07/24/22 15:34 PM
 */
public class KthSmallestElementinaBST {
    int cnt = 1;
    int v = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root.left != null) kthSmallest(root.left, k);
        if (cnt++ == k) return v = root.val;
        if (root.right != null) kthSmallest(root.right, k);
        return v;
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