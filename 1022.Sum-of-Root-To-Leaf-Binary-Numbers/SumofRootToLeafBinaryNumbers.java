/**
 * @author Delete020
 * @since 5/30/22 8:47 PM
 */
public class SumofRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        return help(root, 0);
    }

    private int help(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum = (sum << 1) + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        }

        return help(node.left, sum) + help(node.right, sum);
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
