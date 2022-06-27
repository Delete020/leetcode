import java.util.*;

/**
 * @author Delete020
 * @since 6/27/22 8:48 PM
 */
public class OpentheLock {
    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));

        if (visited.contains("0000")) {
            return -1;
        }
        queue.add("0000");
        visited.add("0000");
        int step = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String curr = queue.poll();
                if (Objects.equals(curr, target)) {
                    return step;
                }

                for (int i = 0; i < 4; i++) {
                    String plus = plusOne(curr, i);
                    if (!visited.contains(plus)) {
                        queue.add(plus);
                        visited.add(plus);
                    }

                    String minus = minusOne(curr, i);
                    if (!visited.contains(minus)) {
                        queue.add(minus);
                        visited.add(minus);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    private String plusOne(String s, int index) {
        char[] c = s.toCharArray();
        if (c[index] == '9') {
            c[index] = '0';
        } else {
            c[index]++;
        }
        return new String(c);
    }

    private String minusOne(String s, int index) {
        char[] c = s.toCharArray();
        if (c[index] == '0') {
            c[index] = '9';
        } else {
            c[index]--;
        }
        return new String(c);
    }
}
