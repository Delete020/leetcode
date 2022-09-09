/**
 * @author Delete020
 * @since 09/09/22 19:46 PM
 */
public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        String back = "../";
        String stay = "./";
        int ans = 0;
        for (String s : logs) {
            if (s.equals(back)) {
                ans = ans == 0 ? 0 : ans - 1;
            } else if (!s.equals(stay)) {
                ans++;
            }
        }

        return ans;
    }
}