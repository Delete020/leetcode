import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 07/21/22 21:49 PM
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {
    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return help(inorder, 0, inorder.length, postorder, inorder.length - 1);
    }

    private TreeNode help(int[] inorder, int left, int right, int[] postorder, int last) {
        if (left == right) return null;
        int index = map.get(postorder[last]);
        TreeNode root = new TreeNode(postorder[last]);
        root.left = help(inorder, left, index, postorder, last + index - right);
        root.right = help(inorder, index + 1, right, postorder, last - 1);
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