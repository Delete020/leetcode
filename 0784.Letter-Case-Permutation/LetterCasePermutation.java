import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 10/30/22 18:41 PM
 */
public class LetterCasePermutation {
    int n;
    List<String> ans = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        n = s.length();
        backtrace(s, 0, new char[n]);
        return ans;
    }

    private void backtrace(String s, int index, char[] result) {
        if (index == n) {
            ans.add(new String(result));
            return;
        }
        char c = s.charAt(index);
        result[index] = c;
        backtrace(s, index + 1, result);
        if (Character.isLowerCase(c)) {
            result[index] = Character.toUpperCase(c);
            backtrace(s, index + 1, result);
        } else if (Character.isUpperCase(c)) {
            result[index] = Character.toLowerCase(c);
            backtrace(s, index + 1, result);
        }
    }
}