import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 02/01/23 21:31 PM
 */
public class CourseSchedule {
    boolean[] visited;
    boolean[] opPath;
    boolean ans = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> map = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) map.add(new ArrayList<>());
        visited = new boolean[numCourses];
        opPath = new boolean[numCourses];
        for (int[] requisite : prerequisites) {
            map.get(requisite[1]).add(requisite[0]);
        }
        for (int i = 0; i < numCourses && ans; i++) {
            if (!visited[i]) dfs(i, map);
        }
        return ans;
    }

    private void dfs(int index, List<List<Integer>> map) {
        if (opPath[index]) ans = false;
        opPath[index] = true;
        for (int i : map.get(index)) {
            if (!visited[i] && ans) dfs(i, map);
        }
        visited[index] = true;
        opPath[index] = false;
    }
}