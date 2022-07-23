import java.util.*;

/**
 * @author Delete020
 * @since 07/23/22 23:06 PM
 */
public class SequenceReconstruction {
    public boolean sequenceReconstruction(int[] nums, int[][] sequences) {
        Map<Integer, Set<Integer>> edge = new HashMap<>();
        int[] degree = new int[nums.length + 1];

        for (int[] sequence : sequences) {
            for (int i = 1; i < sequence.length; i++) {
                int from = sequence[i - 1];
                int to = sequence[i];
                if (edge.containsKey(from) && edge.get(from).contains(to)) continue;
                edge.putIfAbsent(from, new HashSet<>());
                edge.get(from).add(to);
                degree[to]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < degree.length; i++) {
            if (degree[i] == 0) queue.offer(i);
        }

        while (!queue.isEmpty()) {
            if (queue.size() > 1) return false;
            int from = queue.poll();
            Set<Integer> set = edge.get(from);
            if (set == null) return true;
            for (int to : set) {
                degree[to]--;
                if (degree[to] == 0) {
                    queue.offer(to);
                }
            }
        }

        return true;
    }
}