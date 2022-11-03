import java.util.Arrays;
import java.util.Collections;

/**
 * @author Delete020
 * @since 11/03/22 20:19 PM
 */
public class ReverseWordsinaString {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}