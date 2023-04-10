import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Delete020
 * @since 04/10/23 20:26 PM
 */
public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        Stack<int[]> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (head != null) {
            while (!stack.isEmpty() && stack.peek()[0] < head.val) {
                ans.set(stack.pop()[1], head.val);
            }
            ans.add(0);
            stack.push(new int[]{head.val, i++});
            head = head.next;
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
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