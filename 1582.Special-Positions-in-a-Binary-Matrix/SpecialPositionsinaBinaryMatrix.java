/**
 * @author Delete020
 * @since 09/04/22 10:59 AM
 */
public class SpecialPositionsinaBinaryMatrix {
    public int numSpecial(int[][] mat) {
        int n = mat[0].length;
        int[] marked = new int[n];
        for (int[] m : mat) {
            int index = -1;
            for (int j = 0; j < n; j++) {
                if (m[j] != 0) {
                    if (index == -1) {
                        index = j;
                        marked[index]++;
                    } else {
                        marked[index] = 2;
                        marked[j] = 2;
                    }
                }
            }
        }
        int ans = 0;
        for (int i : marked) {
            if (i == 1) ans++;
        }
        return ans;
    }
}