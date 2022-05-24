/**
 * @author Delete020
 * @since 5/24/22 9:29 PM
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = head;
        ListNode current = head.next;

        while (current != null) {
            if (current.val == pre.val) {
                pre.next = current.next;
            } else {
                pre = pre.next;
            }
            current = current.next;
        }

        return head;
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
