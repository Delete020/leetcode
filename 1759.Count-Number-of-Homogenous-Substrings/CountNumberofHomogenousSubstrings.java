/**
 * @author Delete020
 * @since 12/26/22 18:40 PM
 */
public class CountNumberofHomogenousSubstrings {
    public int countHomogenous(String s) {
        long ans = 0;
        int mod = (int) 1e9 + 7;
        long cnt = 0;
        char pre = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c == pre) {
                cnt++;
            } else {
                ans += (cnt + 1) * cnt / 2;
                pre = c;
                cnt = 1;
            }
        }
        ans += (cnt + 1) * cnt / 2;
        return (int) (ans % mod);
    }
}