/**
 * @author Delete020
 * @since 07/05/22 20:36 PM
 */
public class MyCalendarI {
    Map<Integer, Integer> map;

    public MyCalendar() {
        map = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        end--;
        for (Integer k : map.keySet()) {
            if (start > map.get(k) || end < k) continue;
            return false;
        }
        map.put(start, end);
        return true;
    }
}