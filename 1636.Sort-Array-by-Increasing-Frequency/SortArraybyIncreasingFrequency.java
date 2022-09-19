import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 09/19/22 20:16 PM
 */
public class SortArraybyIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        list.sort((a, b) -> {
            int cntA = map.get(a);
            int cntB = map.get(b);
            if (cntA == cntB) return b - a;
            return cntA - cntB;
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}