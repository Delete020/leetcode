import java.util.Arrays;

/**
 * @author Delete020
 * @since 01/11/23 20:54 PM
 */
public class CheckifNumberHasEqualDigitCountandDigitValue {
    public boolean digitCount(String num) {
        int n = num.length();
        char[] ch = new char[n];
        Arrays.fill(ch, '0');
        for (char c : num.toCharArray()) {
            if (c - '0' >= n) return false;
            ch[c - '0']++;
        }
        return num.equals(new String(ch));
    }
}