/**
 * @author Delete020
 * @since 10/26/22 22:39 PM
 */
public class ShortestSubarraywithSumatLeastK {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] sum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = nums[i] + sum[i];
        }
        int ans = Integer.MAX_VALUE;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            long curS = sum[i];
            while (!q.isEmpty() && curS - sum[q.peekFirst()] >= k)
                ans = Math.min(ans, i - q.pollFirst());
            while (!q.isEmpty() && sum[q.peekLast()] >= curS)
                q.pollLast();
            q.offer(i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}