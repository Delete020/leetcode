import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 07/28/22 22:01 PM
 */
public class RankTransformofanArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(copy[i])) {
                map.put(copy[i], j++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}