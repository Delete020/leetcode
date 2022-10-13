import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Delete020
 * @since 10/13/22 20:48 PM
 */
public class MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int ans = 0;
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (queue.isEmpty()) {
                ans++;
            }
            if (!queue.isEmpty() && queue.peek() == clone[i]) {
                queue.poll();
            } else {
                while (j < n && clone[i] != arr[j]) {
                    queue.offer(arr[j++]);
                }
                j++;
            }
        }
        return ans;
    }
}