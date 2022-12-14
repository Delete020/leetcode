import java.util.HashSet;
import java.util.Set;

/**
 * @author Delete020
 * @since 12/13/22 22:07 PM
 */
public class CheckiftheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) set.add(c);
        return set.size() == 26;
    }
}