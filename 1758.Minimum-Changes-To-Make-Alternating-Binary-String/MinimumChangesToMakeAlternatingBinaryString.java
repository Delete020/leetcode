/**
 * @author Delete020
 * @since 11/29/22 09:28 AM
 */
public class MinimumChangesToMakeAlternatingBinaryString {
    public int minOperations(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0 && c != '0') cnt++;
            else if (i % 2 == 1 && c != '1') cnt++;
        }
        return Math.min(cnt, s.length() - cnt);
    }
}