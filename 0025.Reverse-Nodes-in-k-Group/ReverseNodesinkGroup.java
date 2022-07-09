/**
 * @author Delete020
 * @since 07/09/22 22:42 PM
 */
public class ReverseNodesinkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode start = dummy;

        while (true) {
            ListNode index = start;
            for (int i = 0; i < k && index != null; i++) {
                index = index.next;
            }
            if (index == null) return dummy.next;

            ListNode p = start.next;
            ListNode pre = null;
            for (int i = 0; i < k; i++) {
                ListNode temp = p.next;
                p.next = pre;
                pre = p;
                p = temp;
            }

            start.next.next = p;
            index = start.next;
            start.next = pre;
            start = index;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}