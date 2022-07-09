/**
 * @author Delete020
 * @since 07/09/22 19:56 PM
 */
public class LengthofLongestFibonacciSubsequence {
    public int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int n = arr.length;
        int[][] dp = new int[n][n];

        IntStream.range(0, n).forEach(i -> map.put(arr[i], i));

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = arr[j] - arr[i];
                if (k >= arr[i]) break;
                if (!map.containsKey(k)) continue;
                k = map.get(k);
                dp[i][j] = Math.max(3, dp[k][i] + 1);
                res = Math.max(res, dp[i][j]);
            }
        }

        return res;
    }
}