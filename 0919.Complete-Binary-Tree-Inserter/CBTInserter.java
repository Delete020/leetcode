import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Delete020
 * @since 07/25/22 08:19 AM
 */
public class CBTInserter {
    TreeNode root;
    Deque<TreeNode> queue;

    public CBTInserter(TreeNode r) {
        this.root = r;
        queue = new LinkedList<>();
        queue.offer(r);
        TreeNode peek;
        while (true) {
            peek = queue.peek();
            if (peek.left != null) {
                queue.offer(peek.left);
            } else {
                break;
            }
            if (peek.right != null) {
                queue.offer(peek.right);
            } else {
                break;
            }
            queue.poll();
        }
    }

    public int insert(int val) {
        TreeNode peek = queue.peek();
        if (peek.left == null) {
            peek.left = new TreeNode(val);
            queue.offer(peek.left);
        } else {
            peek.right = new TreeNode(val);
            queue.offer(peek.right);
            queue.poll();
        }
        return peek.val;
    }

    public TreeNode get_root() {
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