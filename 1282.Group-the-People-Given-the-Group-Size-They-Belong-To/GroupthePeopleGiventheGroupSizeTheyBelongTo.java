import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 08/13/22 10:19 AM
 */
public class GroupthePeopleGiventheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            map.putIfAbsent(groupSize, new ArrayList<>());
            map.get(groupSize).add(i);
            if (map.get(groupSize).size() == groupSize) {
                res.add(map.get(groupSize));
                map.put(groupSize, new ArrayList<>());
            }
        }
        return res;
    }
}