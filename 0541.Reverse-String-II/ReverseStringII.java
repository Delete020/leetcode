/**
 * @author Delete020
 * @since 11/03/22 20:16 PM
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int cnt = n / k / 2;
        for (int i = 0; i < cnt; i++) {
            int cur = i * 2 * k;
            for (int x = cur + k - 1; x >= cur; x--) {
                sb.append(s.charAt(x));
            }
            sb.append(s.substring(cur + k, cur + k + k));
        }

        int cur = cnt * 2 * k + k;
        cur = Math.min(cur, n);
        for (int i = cur - 1; i >= cnt * 2 * k; i--) {
            sb.append(s.charAt(i));
        }
        sb.append(s.substring(cur));
        return sb.toString();
    }
}