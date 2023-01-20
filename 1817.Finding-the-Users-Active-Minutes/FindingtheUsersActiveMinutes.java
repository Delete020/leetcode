import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Delete020
 * @since 01/20/23 20:51 PM
 */
public class FindingtheUsersActiveMinutes {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            if (!map.containsKey(log[0])) map.put(log[0], new HashSet<>());
            map.get(log[0]).add(log[1]);
        }
        for (var set : map.values()) ans[set.size() - 1]++;
        return ans;
    }
}