import java.util.Map;
import java.util.TreeMap;

/**
 * @author Delete020
 * @since 07/19/22 21:14 PM
 */
public class MyCalendarII {
    Map<Integer, Integer> map;

    public MyCalendarII() {
        map = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);
        int ans = 0;
        for (int v : map.values()) {
            if ((ans += v) >= 3) {
                map.put(start, map.getOrDefault(start, 0) - 1);
                map.put(end, map.getOrDefault(end, 0) + 1);
                return false;
            }
        }
        return true;
    }
}