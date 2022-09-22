/**
 * @author Delete020
 * @since 09/22/22 21:10 PM
 */
public class CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        for (int[] piece : pieces) {
            for (int i = 0, j = map.getOrDefault(piece[0], n); i < piece.length; i++, j++) {
                if (j == n || piece[i] != arr[j]) return false;
            }
        }
        return true;
    }
}