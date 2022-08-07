import java.util.List;
import java.util.Stack;

/**
 * @author Delete020
 * @since 08/07/22 09:21 AM
 */
public class ExclusiveTimeofFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();
        String start = "start";

        for (String log : logs) {
            String[] timeStamp = log.split(":");
            int func = Integer.parseInt(timeStamp[0]);
            int time = Integer.parseInt(timeStamp[2]);

            if (timeStamp[1].equals(start)) {
                stack.push(new int[]{func, time});
            } else {
                int minus = time - stack.pop()[1] + 1;
                res[func] += minus;
                stack.forEach(k -> k[1] += minus);
            }
        }

        return res;
    }

    public int[] exclusiveTime2(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();
        String start = "start";

        for (String log : logs) {
            String[] timeStamp = log.split(":");
            int func = Integer.parseInt(timeStamp[0]);
            int time = Integer.parseInt(timeStamp[2]);

            if (timeStamp[1].equals(start)) {
                if (!stack.isEmpty()) {
                    res[stack.peek()[0]] += time - stack.peek()[1];
                    stack.peek()[1] = time;
                }
                stack.push(new int[]{func, time});
            } else {
                res[func] += time - stack.pop()[1] + 1;
                if (!stack.isEmpty()) {
                    stack.peek()[1] = time + 1;
                }
            }
        }

        return res;
    }
}