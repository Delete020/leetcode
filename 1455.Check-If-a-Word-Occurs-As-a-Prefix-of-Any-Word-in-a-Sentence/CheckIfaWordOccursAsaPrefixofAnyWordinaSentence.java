/**
 * @author Delete020
 * @since 08/21/22 10:25 AM
 */
public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}