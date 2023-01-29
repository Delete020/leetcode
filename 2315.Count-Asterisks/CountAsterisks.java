/**
 * @author Delete020
 * @since 01/29/23 17:46 PM
 */
public class CountAsterisks {
    public int countAsterisks(String s) {
        int ans = 0;
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '|') cnt++;
            else if (cnt % 2 == 0 && c == '*') ans++;
        }
        return ans;
    }
}