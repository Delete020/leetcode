public class sol {
    Node pre;
    Node head;

    public Node treeToDoublyList(Node root) {
        helper(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void helper(Node root) {
        if (root == null) {
            return;
        }

        helper(root.left);

        root.left = pre;
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        pre = root;

        helper(root.right);
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}
