import java.util.Stack;

/**
 * @author Delete020
 * @since 10/28/22 21:43 PM
 */
public class SumofSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int mod = (int) 1e9 + 7;
        int n = arr.length;
        int sum = 0;
        int[] dp = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                dp[i] = (arr[i] * (i + 1) + mod) % mod;
            } else {
                dp[i] = (dp[stack.peek()] + arr[i] * (i - stack.peek())) % mod;
            }
            stack.push(i);
            sum = (sum + dp[i]) % mod;
        }
        return sum;
    }
}