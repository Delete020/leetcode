/**
 * @author Delete020
 * @since 09/13/22 21:08 PM
 */
public class MaximumSwap {
    public int maximumSwap(int num) {
        int n = num;
        int length = 0;
        while ((n = n / 10) != 0) {
            length++;
        }
        for (int i = length; i >= 0; i--) {
            int cur = num / (int) Math.pow(10, i) % 10;
            if (cur == 9) continue;
            int max = cur;
            int index = -1;
            for (int j = 0; j <= i; j++) {
                int k = num / (int) Math.pow(10, j) % 10;
                if (k > max) {
                    max = k;
                    index = j;
                }
            }
            if (index != -1) {
                return num - cur * (int) Math.pow(10, i) - max * (int) Math.pow(10, index) + cur * (int) Math.pow(10, index) + +max * (int) Math.pow(10, i);
            }
        }

        return num;
    }
}