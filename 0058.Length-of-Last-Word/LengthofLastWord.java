/**
 * @author Delete020
 * @since 11/01/22 23:11 PM
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            ans++;
        }
        return ans;
    }
}