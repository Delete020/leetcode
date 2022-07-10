/**
 * @author Delete020
 * @since 07/10/22 14:48 PM
 */
public class PalindromeLinkedList {
    ListNode left = null;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return help(head);
    }

    private boolean help(ListNode head) {
        if (head == null) {
            return true;
        }
        boolean res = help(head.next);
        res = (head.val == left.val) && res;
        left = left.next;
        return res;
    }
}