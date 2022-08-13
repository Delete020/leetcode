/**
 * @author Delete020
 * @since 08/13/22 10:36 AM
 */
public class MaxChunksToMakeSortedII {
    public int maxChunksToSorted(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int sum1 = 0;
        int sum2 = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            sum2 += clone[i];
            if (sum1 == sum2) res++;
        }
        return res;
    }
}