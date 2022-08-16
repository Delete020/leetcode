import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 08/16/22 20:20 PM
 */
public class OrderedStream {
    String[] s;
    int p;
    int n;

    public OrderedStream(int n) {
        s = new String[n + 1];
        this.n = n;
        p = 1;
    }

    public List<String> insert(int idKey, String value) {
        s[idKey] = value;
        List<String> res = new ArrayList<>();
        if (idKey != p) return res;
        while (p <= n && s[p] != null) {
            res.add(s[p++]);
        }
        return res;
    }
}