import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 02/01/23 21:29 PM
 */
public class DecodetheMessage {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        map.put(' ', ' ');
        char f = 'a';
        for (char c : key.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, f++);
        }
        for (char c : message.toCharArray()) sb.append(map.get(c));
        return sb.toString();
    }
}