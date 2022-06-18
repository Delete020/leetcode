/**
 * @author Delete020
 * @since 6/18/22 2:15 PM
 */
public class InsertintoaSortedCircularLinkedList {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            head = new Node(insertVal);
            head.next = head;
            return head;
        }

        Node p = head;
        Node pre = head;
        while (pre.next != head) {
            if (pre.val > p.val) {
                if (insertVal >= pre.val || insertVal <= p.val) {
                    pre.next = new Node(insertVal, p);
                    return head;
                }
            }

            if (p.val >= insertVal && pre.val <= insertVal) {
                pre.next = new Node(insertVal, p);
                return head;
            }

            pre = p;
            p = p.next;
        }

        pre.next = new Node(insertVal, p);
        return head;
    }

    class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }
}
