import java.util.HashSet;
import java.util.Set;

/**
 * @author Delete020
 * @since 10/12/22 21:24 PM
 */
public class LinkedListComponents {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        ListNode q = head;
        int cnt = 0;
        while (q != null) {
            if (set.contains(q.val) && (q.next == null || !set.contains(q.next.val))) cnt++;
            q = q.next;
        }
        return cnt;
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