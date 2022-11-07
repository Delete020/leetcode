import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 11/07/22 23:03 PM
 */
public class AmbiguousCoordinates {
    String s;

    public List<String> ambiguousCoordinates(String _s) {
        s = _s.substring(1, _s.length() - 1);
        List<String> ans = new ArrayList<>();
        for (int i = 0, n = s.length(); i < n - 1; i++) {
            List<String> a = search(0, i), b = search(i + 1, n - 1);
            for (String x : a) for (String y : b) ans.add("(" + x + ", " + y + ")");
        }
        return ans;
    }

    List<String> search(int start, int end) {
        List<String> ans = new ArrayList<>();
        boolean beginZero = s.charAt(start) == '0', endZero = s.charAt(end) == '0';
        if (start == end || !beginZero) ans.add(s.substring(start, end + 1));
        for (int i = start; i < end; i++) {
            if ((beginZero && i > start) || endZero) continue;
            ans.add(s.substring(start, i + 1) + "." + s.substring(i + 1, end + 1));
        }
        return ans;
    }
}