import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 01/12/23 21:03 PM
 */
public class EvaluatetheBracketPairsofaString {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean f = false;
        for (List<String> k : knowledge) map.put(k.get(0), k.get(1));
        for (char c : s.toCharArray()) {
            if (c == '(') {
                f = true;
            } else if (c == ')') {
                f = false;
                sb.append(map.getOrDefault(temp.toString(), "?"));
                temp = new StringBuilder();
            } else if (f) {
                temp.append(c);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}