import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 07/21/22 21:50 PM
 */
public class ConstructBinaryTreefromPreorderandPostorderTraversal {
    Map<Integer, Integer> map;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i], i);
        }
        return help(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode help(int[] preorder, int preLeft, int preRight, int[] postorder, int postLeft, int postRight) {
        if (preLeft > preRight) return null;
        if (preLeft == preRight) return new TreeNode(preorder[preLeft]);
        int index = map.get(preorder[preLeft + 1]);
        int leftSize = index - postLeft + 1;
        TreeNode root = new TreeNode(preorder[preLeft]);
        root.left = help(preorder, preLeft + 1, preLeft + leftSize, postorder, postLeft, index);
        root.right = help(preorder, preLeft + leftSize + 1, preRight, postorder, index + 1, postRight - 1);
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