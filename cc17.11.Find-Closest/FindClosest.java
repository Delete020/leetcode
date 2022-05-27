/**
 * @author Delete020
 * @since 5/27/22 11:39 PM
 */
public class FindClosest {
    public int findClosest(String[] words, String word1, String word2) {
        int word1Index = -1;
        int word2Index = -1;
        int res = Integer.MAX_VALUE;

        int i = 0;
        for (String word : words) {
            if (word.equals(word1)) {
                word1Index = i;
            } else if (word.equals(word2)) {
                word2Index = i;
            }
            i++;

            if (word2Index != -1 && word1Index != -1) {
                res = Math.min(res, Math.abs(word2Index - word1Index));
            }
        }

        return res;
    }
}
