/**
 * @author cancel
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode point = l1;
        ListNode last = l1;

        while (point != null && l2 != null) {
            int val = point.val + l2.val + carry;
            point.val = val % 10;
            carry = val / 10;

            if (point.next == null && l2.next != null) {
                point.next = new ListNode(0);
            }

            point = point.next;
            l2 = l2.next;
        }

        while (last.next != null) {
            last = last.next;
        }

        while (carry == 1) {
            if (point == null) {
                last.next = new ListNode(1);
                break;
            }

            int val = point.val + carry;
            point.val = val % 10;
            carry = val / 10;
            point = point.next;
        }

        return l1;
    }

    public static class ListNode {
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
