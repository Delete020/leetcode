import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 11/25/22 20:04 PM
 */
public class ExpressiveWords {
    public int expressiveWords(String s, String[] words) {
        List<int[]> list = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < s.length(); ) {
            int cnt = 1;
            char c = s.charAt(i);
            while (++i < s.length() && c == s.charAt(i)) cnt++;
            list.add(new int[]{c, cnt});
        }

        int ans = words.length;
        for (String word : words) {
            int index = 0;
            int length = word.length();
            if (length > n) {
                ans--;
                break;
            }
            for (int[] c : list) {
                int cnt = 0;
                while (index < length && word.charAt(index) == c[0]) {
                    cnt++;
                    index++;
                }
                if (cnt == 0 || cnt > c[1] || (c[1] == 2 && cnt != 2)) {
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }
}