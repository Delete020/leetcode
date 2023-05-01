import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 05/01/23 22:21 PM
 */
public class TimeNeededtoInformAllEmployees {
    private int ans = 0;

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(manager[i], k -> new ArrayList<>());
            map.get(manager[i]).add(i);
        }
        dfs(map, headID, 0, manager, informTime);
        return ans;
    }

    private void dfs(Map<Integer, List<Integer>> map, int i, int cnt, int[] manager, int[] informTime) {
        if (informTime[i] == 0) {
            ans = Math.max(ans, cnt);
            return;
        }
        cnt += informTime[i];
        for (int j : map.get(i)) {
            dfs(map, j, cnt, manager, informTime);
        }
    }
}