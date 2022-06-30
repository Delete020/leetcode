/**
 * @author Delete020
 * @since 6/30/22 9:29 PM
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode p = dummy;
        for (int i = 0; i < n; i++) {
            p = p.next;
        }

        ListNode pre = dummy;
        while (p.next != null) {
            p = p.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;

        return dummy.next;
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
