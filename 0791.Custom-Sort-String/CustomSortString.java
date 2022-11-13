import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 11/13/22 18:21 PM
 */
public class CustomSortString {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : order.toCharArray()) {
            map.put(c, 0);
        }
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else sb.append(c);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())));
        }
        return sb.toString();
    }
}