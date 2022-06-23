import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 6/23/22 8:18 PM
 */
public class SubstringwithConcatenationofAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        int n = s.length();
        int w = words.length;
        int wordLength = words[0].length();

        for (int i = 0; i < wordLength; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int left = i;

            for (int j = i; j + wordLength <= n; j += wordLength) {
                String currentWord = s.substring(j, j + wordLength);
                map.put(currentWord, map.getOrDefault(currentWord, 0) + 1);

                if (j - left >= w * wordLength) {
                    String pre = s.substring(left, left + wordLength);
                    left += wordLength;
                    if (map.get(pre) == 1) {
                        map.remove(pre);
                    } else {
                        map.put(pre, map.get(pre) - 1);
                    }
                    if (!map.getOrDefault(pre, 0).equals(wordMap.getOrDefault(pre, 0))) {
                        continue;
                    }
                }

                if (!map.get(currentWord).equals(wordMap.get(currentWord))) {
                    continue;
                }
                if (map.equals(wordMap)) {
                    res.add(left);
                }
            }
        }

        return res;
    }
}
