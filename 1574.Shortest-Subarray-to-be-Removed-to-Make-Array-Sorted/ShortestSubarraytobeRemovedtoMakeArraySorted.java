/**
 * @author Delete020
 * @since 03/25/23 16:56 PM
 */
public class ShortestSubarraytobeRemovedtoMakeArraySorted {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int l = 1, r = n - 2, ans = 0;
        while (l < n && arr[l] >= arr[l - 1]) l++;
        if (l == n) return ans;
        while (r >= 0 && arr[r] <= arr[r + 1]) r--;
        ans = Math.min(n - l, r + 1);
        for (int i = l - 1; i >= 0; i--) {
            int j = r + 1;
            while (j < n && arr[j] < arr[i]) j++;
            ans = Math.min(ans, j - i - 1);
        }
        return ans;
    }
}