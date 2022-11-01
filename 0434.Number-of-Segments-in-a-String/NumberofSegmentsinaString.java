/**
 * @author Delete020
 * @since 11/01/22 23:09 PM
 */
public class NumberofSegmentsinaString {
    public int countSegments(String s) {
        s += ' ';
        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
                cnt++;
            }
        }
        return cnt;
    }
}