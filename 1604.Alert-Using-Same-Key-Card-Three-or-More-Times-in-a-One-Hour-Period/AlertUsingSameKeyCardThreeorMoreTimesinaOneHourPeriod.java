import java.util.*;

/**
 * @author Delete020
 * @since 02/09/23 21:32 PM
 */
public class AlertUsingSameKeyCardThreeorMoreTimesinaOneHourPeriod {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        var ans = new ArrayList<String>();
        for (int i = 0; i < keyName.length; i++) {
            String name = keyName[i];
            if (!map.containsKey(name)) map.put(name, new ArrayList<>());
            int hour = Integer.parseInt(keyTime[i].substring(0, 2));
            int min = Integer.parseInt(keyTime[i].substring(3));
            map.get(name).add(hour * 60 + min);
        }

        for (var k : map.keySet()) {
            Collections.sort(map.get(k));
            Queue<Integer> queue = new LinkedList<>();
            for (var v : map.get(k)) {
                queue.offer(v);
                if (!v.equals(queue.peek()) && v - queue.peek() > 60) {
                    queue.poll();
                }
                if (queue.size() == 3) {
                    ans.add(k);
                    break;
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}