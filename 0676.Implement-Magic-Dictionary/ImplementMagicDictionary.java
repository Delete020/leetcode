import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 07/11/22 20:57 PM
 */
public class ImplementMagicDictionary {
    class MagicDictionary {
        Map<Integer, List<String>> map;

        public MagicDictionary() {
            map = new HashMap<>();
        }

        public void buildDict(String[] dictionary) {
            for (String s : dictionary) {
                int n = s.length();
                if (!map.containsKey(n)) {
                    map.put(n, new ArrayList<String>());
                }
                map.get(n).add(s);
            }
        }

        public boolean search(String searchWord) {
            int n = searchWord.length();
            if (!map.containsKey(n)) return false;
            List<String> list = map.get(n);
            for (String s : list) {
                int cnt = 0;
                int i = 0;
                while (i < n && cnt <= 1) {
                    if (searchWord.charAt(i) != s.charAt(i)) {
                        cnt++;
                    }
                    i++;
                }
                if (cnt == 1 && i == n) {
                    return true;
                }
            }
            return false;
        }
    }
}