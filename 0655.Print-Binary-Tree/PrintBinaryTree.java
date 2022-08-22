import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Delete020
 * @since 08/22/22 20:39 PM
 */
public class PrintBinaryTree {
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int row = 1;
        boolean hashNext = true;

        while (hashNext) {
            for (List<String> list : res) {
                for (int i = 0; i < row; i += 2) {
                    list.add(i, "");
                }
            }
            hashNext = false;
            int size = queue.size();
            List<String> curLevel = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i != 0) curLevel.add("");
                if (node.val == 100) {
                    curLevel.add("");
                } else {
                    curLevel.add(node.val + "");
                }
                if (node.left != null) {
                    hashNext = true;
                    queue.add(node.left);
                } else {
                    queue.add(new TreeNode(100));
                }
                if (node.right != null) {
                    hashNext = true;
                    queue.add(node.right);
                } else {
                    queue.add(new TreeNode(100));
                }
            }
            res.add(curLevel);
            row = row * 2 + 1;
        }

        return res;
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