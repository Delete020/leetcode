/**
 * @author Delete020
 * @since 08/17/22 21:35 PM
 */
public class DeepestLeavesSum {
    int maxLevel = 0;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int level) {
        if (root == null) return;

        if (level > maxLevel) {
            maxLevel = level;
            sum = root.val;
        } else if (level == maxLevel) {
            sum += root.val;
        }

        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
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