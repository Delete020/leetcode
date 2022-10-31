/**
 * @author Delete020
 * @since 10/31/22 11:33 AM
 */
public class MagicalString {
    public int magicalString(int n) {
        if (n <= 3) return 1;
        int[] array = new int[n];
        array[2] = 2;
        int cnt = 1;
        int last = 3;
        boolean f = true;
        for (int i = 2; last < n; i++) {
            int cur = f ? 1 : 2;
            for (int j = 0; last < n && j < array[i]; j++) {
                array[last++] = cur;
                if (f) cnt++;
            }
            f = !f;
        }
        return cnt;
    }
}