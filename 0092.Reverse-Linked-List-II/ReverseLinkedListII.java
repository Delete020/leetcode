/**
 * @author Delete020
 * @since 07/09/22 20:19 PM
 */
public class ReverseLinkedListII {

    ListNode pre = null;

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode start = dummy;
        for (int i = 1; i < left; i++) {
            start = start.next;
        }

        ListNode p = start.next;
        ListNode pre = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode temp = p.next;
            p.next = pre;
            pre = p;
            p = temp;
        }
        start.next.next = p;
        start.next = pre;

        return dummy.next;
    }

    public ListNode reverseBetween2(ListNode head, int left, int right) {
        if (left == 1) {
            return reverseN(head, right);
        }
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    private ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            pre = head.next;
            return head;
        }

        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = pre;
        return last;
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