import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 11/14/22 23:07 PM
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<Double, Integer> map = new HashMap<>();
        double[] arr = new double[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for (String s : strs) {
            double hash = 1;
            for (char c : s.toCharArray()) {
                hash *= arr[c - 'a'];
            }
            if (!map.containsKey(hash)) {
                map.put(hash, ans.size());
                ans.add(new ArrayList<>());
            }
            ans.get(map.get(hash)).add(s);
        }
        return ans;
    }
}