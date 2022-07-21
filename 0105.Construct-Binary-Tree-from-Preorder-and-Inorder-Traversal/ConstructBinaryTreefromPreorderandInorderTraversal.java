import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 07/21/22 21:47 PM
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return help(preorder, 0, inorder, 0, inorder.length);
    }

    private TreeNode help(int[] preorder, int preLeft, int[] inorder, int left, int right) {
        if (left == right || preLeft == preorder.length) return null;
        int index = map.get(preorder[preLeft]);
        TreeNode root = new TreeNode(preorder[preLeft]);
        root.left = help(preorder, preLeft + 1, inorder, left, index);
        root.right = help(preorder, preLeft + index - left + 1, inorder, index + 1, right);
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