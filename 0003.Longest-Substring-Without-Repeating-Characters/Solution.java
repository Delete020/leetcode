import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int first = 0;
        int i = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                first = Math.max(map.get(c), first);
            }
            max = Math.max(max, i - first);
            map.put(c, i++);
        }
        return max;
    }
}
