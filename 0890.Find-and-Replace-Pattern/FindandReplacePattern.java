import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 6/12/22 12:24 PM
 */
public class FindandReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        int length = pattern.length();

        for (String word : words) {
            boolean correct = true;
            Map<Character, Character> map = new HashMap<>();

            for (int i = 0; i < length; i++) {
                char patternChar = pattern.charAt(i);
                char wordChar = word.charAt(i);

                if (map.get(patternChar) == null && !map.containsValue(wordChar)) {
                    map.put(patternChar, wordChar);
                } else if (map.get(patternChar) == null || map.get(patternChar) != wordChar) {
                    correct = false;
                    break;
                }
            }

            if (correct) {
                res.add(word);
            }
        }

        return res;
    }
}
