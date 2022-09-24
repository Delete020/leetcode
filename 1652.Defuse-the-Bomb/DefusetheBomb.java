/**
 * @author Delete020
 * @since 09/24/22 21:51 PM
 */
public class DefusetheBomb {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) return ans;

        int s = k > 0 ? 1 : -1;
        k = Math.abs(k);

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                ans[i] += code[(i + n + j * s) % n];
            }
        }

        return ans;
    }
}