import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 02/06/23 20:54 PM
 */
public class CourseScheduleII {
    boolean[] visited;
    int[] ans;
    boolean[] opPath;
    boolean f = true;
    int cnt = 0;
    int n = 0;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        n = numCourses;
        List<List<Integer>> map = new ArrayList<>(numCourses);
        visited = new boolean[numCourses];
        opPath = new boolean[numCourses];
        ans = new int[numCourses];
        for (int i = 0; i < numCourses; i++) map.add(new ArrayList<>());
        for (int[] requisite : prerequisites) {
            map.get(requisite[1]).add(requisite[0]);
        }
        for (int i = 0; i < numCourses && f; i++) {
            if (!visited[i]) {
                dfs(i, map);
                if (cnt < n) ans[cnt++] = i;
            }
            visited[i] = true;
        }
        if (!f) return new int[]{};
        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            int t = ans[i];
            ans[i] = ans[j];
            ans[j] = t;
        }
        return ans;
    }

    private void dfs(int index, List<List<Integer>> map) {
        if (opPath[index]) f = false;
        opPath[index] = true;
        for (int i : map.get(index)) {
            if (!visited[i] && f) {
                dfs(i, map);
                if (cnt < n) ans[cnt++] = i;
            }
            visited[i] = true;
        }
        opPath[index] = false;
    }
}