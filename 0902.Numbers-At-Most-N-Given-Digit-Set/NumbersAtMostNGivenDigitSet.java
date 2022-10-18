import java.util.stream.IntStream;

/**
 * @author Delete020
 * @since 10/18/22 19:47 PM
 */
public class NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] d, int n) {
        int arrayLength = d.length;
        int[] digits = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            digits[i] = Integer.parseInt(d[i]);
        }

        int length = 0;
        int num = n;
        while (num != 0) {
            num /= 10;
            length++;
        }

        int[] dp = new int[length + 1];
        dp[0] = 1;
        dp[1] = arrayLength;
        for (int i = 2; i < length; i++) {
            dp[i] = dp[i - 1] * dp[1];
        }

        int last = 0;
        for (int i = 1; i <= length; i++) {
            int cur = (int) (n / Math.pow(10, length - i)) % 10;
            int index = search(digits, cur);
            last += dp[length - i] * index;
            if (index < arrayLength && digits[index] == cur && i == length) last += dp[length - i];
            if (index >= arrayLength || digits[index] > cur) break;
        }
        dp[length] = last;
        return IntStream.of(dp).sum() - 1;
    }

    private int search(int[] d, int n) {
        int l = 0;
        int r = d.length;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (d[mid] == n) return mid;
            if (d[mid] > n) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}