/**
 * @author Delete020
 * @since 07/21/22 21:44 PM
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return help(nums, 0, nums.length);
    }

    public TreeNode help(int[] nums, int left, int right) {
        if (left == right) return null;
        int index = left;
        for (int i = left; i < right; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        return new TreeNode(nums[index], help(nums, left, index), help(nums, index + 1, right));
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