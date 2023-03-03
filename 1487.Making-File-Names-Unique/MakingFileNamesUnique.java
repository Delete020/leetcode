import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 03/03/23 22:58 PM
 */
public class MakingFileNamesUnique {
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>(names.length);
        for (String s : names) {
            int cnt = map.getOrDefault(s, 1);
            String rename = s;
            while (map.containsKey(rename)) {
                rename = s + '(' + cnt + ')';
                cnt++;
            }
            map.put(s, cnt);
            map.put(rename, 1);
            ans.add(rename);
        }
        return ans.toArray(new String[0]);
    }
}