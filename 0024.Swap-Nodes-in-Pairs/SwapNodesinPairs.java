/**
 * @author Delete020
 * @since 12/16/22 19:04 PM
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode s = new ListNode(-1, head);
        ListNode pre = s;
        ListNode cur = head;
        ListNode p = head.next;
        while (p != null) {
            ListNode next = p.next;
            cur.next = next;
            pre.next = p;
            p.next = cur;
            pre = cur;
            cur = next;
            p = next == null ? next : next.next;
        }
        return s.next;
    }
}