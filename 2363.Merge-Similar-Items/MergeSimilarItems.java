import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * @author Delete020
 * @since 02/28/23 21:19 PM
 */
public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Arrays.stream(items1).forEach(item -> map.put(item[0], item[1]));
        Arrays.stream(items2).forEach(item -> map.put(item[0], map.getOrDefault(item[0], 0) + item[1]));
        List<List<Integer>> ans = new ArrayList<>();
        for (var k : map.keySet()) ans.add(List.of(new Integer[]{k, map.get(k)}));
        return ans;
    }
}