/**
 * @author Delete020
 * @since 07/04/22 21:58 PM
 */
public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < min) {
                min = diff;
                res.clear();
            }
            if (diff == min) {
                res.add(new ArrayList<>(List.of(arr[i - 1], arr[i])));
            }
        }

        return res;
    }
}