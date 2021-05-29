import java.util.HashMap;
import java.util.Map;

/**
 * @author cancel
 * @since 5/29/21 2:03 PM
 */
public class Solution {

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        return help(head, map);
    }

    private Node help(Node head, Map<Node, Node> map) {
        if (head == null) {
            return null;
        }
        Node list = new Node(head.val);
        map.put(head, list);
        list.next = help(head.next, map);
        list.random = map.get(head.random);

        return list;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}

