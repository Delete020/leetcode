import java.util.Stack;

/**
 * @author cancel
 * @since 5/16/22 9:55 PM
 */
public class Successor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode ptr = root;
        int target = p.val;

        while (ptr != null || !st.isEmpty()) {
            if (ptr != null) {
                if (ptr.val <= target) {
                    ptr = ptr.right;
                    continue;
                }
                st.push(ptr);
                ptr = ptr.left;
            } else {
                ptr = st.pop();
                if (ptr.val > target) {
                    return ptr;
                }
                ptr = ptr.right;
            }
        }

        return null;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
