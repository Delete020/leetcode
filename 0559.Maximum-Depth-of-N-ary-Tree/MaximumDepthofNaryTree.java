import java.util.List;

/**
 * @author Delete020
 * @since 6/1/22 10:37 AM
 */
public class MaximumDepthofNaryTree {
    int res = 0;

    public int maxDepth(Node root) {
        return help(root, 0);
    }

    private int help(Node root, int i) {
        if (root == null) {
            return 0;
        }

        res = Math.max(res, ++i);
        for (Node node : root.children) {
            help(node, i);
        }

        return res;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
