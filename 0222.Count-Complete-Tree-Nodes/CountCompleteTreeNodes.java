/**
 * @author Delete020
 * @since 08/03/22 20:50 PM
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int i = 0;
        TreeNode leftLeaf = root;
        while (leftLeaf != null) {
            leftLeaf = leftLeaf.left;
            i++;
        }

        int j = 0;
        TreeNode rightLeaf = root;
        while (rightLeaf != null) {
            rightLeaf = rightLeaf.right;
            j++;
        }

        if (i == j) return (int) Math.pow(2, i) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
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