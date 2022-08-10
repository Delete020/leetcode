import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 08/10/22 21:02 PM
 */
public class DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        int maxDegree = 0;
        int res = -1;
        Map<Integer, Elem> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!map.containsKey(n)) {
                map.put(n, new Elem(i));
            }
            int count = map.get(n).setIndex(i);

            if (count == maxDegree && map.get(res).distance > map.get(n).distance) {
                res = n;
            }
            if (count > maxDegree) {
                res = n;
                maxDegree = count;
            }
        }

        return map.get(res).distance + 1;
    }

    class Elem {
        int cnt = 0;
        int firstIndex = -1;
        int lastIndex = -1;
        int distance = 0;

        public Elem(int index) {
            firstIndex = index;
            lastIndex = index;
        }

        private int setIndex(int i) {
            lastIndex = i;
            this.distance = lastIndex - firstIndex;
            return ++cnt;
        }
    }
}