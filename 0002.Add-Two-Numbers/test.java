import org.junit.Test;

public class test {

    @Test
    public void test() {
        Solution sol = new Solution();
        Solution.ListNode l1 = new Solution.ListNode(2);
        Solution.ListNode l2 = new Solution.ListNode(5);

        int[] n1 = {4, 9};
        int[] n2 = {6, 4, 9};

        Solution.ListNode p1 = l1;
        Solution.ListNode p2 = l2;

        for (int i : n1) {
            p1.next = new Solution.ListNode(i);
            p1 = p1.next;
        }

        for (int i : n2) {
            p2.next = new Solution.ListNode(i);
            p2 = p2.next;
        }

        sol.addTwoNumbers(l1, l2);
    }

}
