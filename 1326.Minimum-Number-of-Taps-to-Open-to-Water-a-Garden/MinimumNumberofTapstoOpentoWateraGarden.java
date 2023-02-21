import java.util.Arrays;

/**
 * @author Delete020
 * @since 02/21/23 19:53 PM
 */
public class MinimumNumberofTapstoOpentoWateraGarden {
    public int minTaps(int n, int[] ranges) {
        int[] cnt = new int[n + 1];
        Arrays.fill(cnt, Integer.MAX_VALUE);
        cnt[0] = 0;
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] == 0) continue;
            int start = Math.max(0, i - ranges[i]);
            int end = Math.min(n, i + ranges[i]);
            if (start != 0 && cnt[start - 1] == Integer.MAX_VALUE) continue;
            if (cnt[end] != Integer.MAX_VALUE) continue;
            int cur = cnt[start];
            while (start <= end) cnt[start] = Math.min(cnt[start++], cur + 1);
        }
        return cnt[n] == Integer.MAX_VALUE ? -1 : cnt[n];
    }
}