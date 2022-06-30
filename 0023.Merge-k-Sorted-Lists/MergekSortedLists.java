import java.util.PriorityQueue;

/**
 * @author Delete020
 * @since 6/30/22 9:08 PM
 */
public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> (a.val - b.val));
        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            queue.add(list);
        }

        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            p.next = node;
            p = p.next;
            if (node.next != null) {
                queue.offer(node.next);
            }
        }

        return head.next;
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
