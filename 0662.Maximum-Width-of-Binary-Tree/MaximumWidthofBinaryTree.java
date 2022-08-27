import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Delete020
 * @since 08/27/22 09:41 AM
 */
public class MaximumWidthofBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 1));
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ans = Math.max(queue.peekLast().index - queue.peekFirst().index, ans);
            for (int i = 0; i < size; i++) {
                Pair p = queue.pollFirst();
                if (p.node.left != null) {
                    queue.offer(new Pair(p.node.left, p.index * 2 - 1));
                }
                if (p.node.right != null) {
                    queue.offer(new Pair(p.node.right, p.index * 2));
                }
            }
        }
        return ans + 1;
    }

    class Solution2 {
        int ans = 0;
        List<Integer> start = new ArrayList<>();

        public int widthOfBinaryTree(TreeNode root) {
            dfs(root, 1, 1);
            return ans + 1;
        }

        private void dfs(TreeNode node, int index, int level) {
            if (node == null) return;
            if (level > start.size()) start.add(index);
            ans = Math.max(ans, index - start.get(level - 1));
            dfs(node.left, index * 2 - 1, level + 1);
            dfs(node.right, index * 2, level + 1);
        }
    }

    class Pair {
        TreeNode node;
        int index;

        public Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
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