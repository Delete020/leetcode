/**
 * @author Delete020
 * @since 01/30/23 20:09 PM
 */
public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l = list1;
        for (int i = 1; i < a; i++) l = l.next;
        ListNode r = l;
        for (int i = a - 1; i <= b; i++) r = r.next;
        l.next = list2;
        while (l.next != null) l = l.next;
        l.next = r;
        return list1;
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