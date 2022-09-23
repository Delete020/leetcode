/**
 * @author Delete020
 * @since 09/23/22 22:41 PM
 */
public class DesignLinkedList {
    class MyLinkedList {
        Node head;
        Node tail;

        public MyLinkedList() {
            head = new Node(-1);
            tail = new Node(-1);
            head.next = tail;
            head.pre = tail;
            tail.pre = head;
            tail.next = head;
        }

        public int get(int index) {
            Node p = head;
            for (int i = -1; i < index; i++) {
                p = p.next;
                if (p == tail) return -1;
            }
            return p.val;
        }

        public void addAtHead(int val) {
            Node newNode = new Node(val, head, head.next);
            head.next.pre = newNode;
            head.next = newNode;
        }

        public void addAtTail(int val) {
            Node newNode = new Node(val, tail.pre, tail);
            tail.pre.next = newNode;
            tail.pre = newNode;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0) {
                addAtHead(val);
                return;
            }
            Node p = head;
            for (int i = -1; i < index; i++) {
                p = p.next;
                if (p == tail && i == index - 1) {
                    break;
                }
            }
            Node newNode = new Node(val, p.pre, p);
            p.pre.next = newNode;
            p.pre = newNode;
        }

        public void deleteAtIndex(int index) {
            if (index < 0) return;
            Node p = head;
            for (int i = -1; i < index; i++) {
                p = p.next;
                if (p == tail) return;
            }
            p.next.pre = p.pre;
            p.pre.next = p.next;
        }

        class Node {
            int val;
            Node next;
            Node pre;

            Node(int v) {
                this(v, null, null);
            }

            Node(int v, Node pre, Node next) {
                this.val = v;
                this.pre = pre;
                this.next = next;
            }
        }
    }
}