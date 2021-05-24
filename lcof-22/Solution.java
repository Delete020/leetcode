/**
 * @author cancel
 * @since 5/24/21 4:18 PM
 */
public class Solution {

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode curr = head;
        int i = 0;

        while (curr.next != null) {
            i++;
            if (i >= k) {
                head = head.next;
            }
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        int[] list = {2, 3, 4, 5};

        ListNode p = h;
        for (int i : list) {
            p.next = new ListNode(i);
            p = p.next;
        }
        ListNode result = getKthFromEnd(h, 2);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
