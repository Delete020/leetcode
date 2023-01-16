/**
 * @author Delete020
 * @since 01/16/23 21:59 PM
 */
public class SentenceSimilarityIII {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.length() < sentence2.length()) {
            String temp = sentence1;
            sentence1 = sentence2;
            sentence2 = temp;
        }
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int n1 = s1.length, n2 = s2.length;
        int i = 0, j = 1;
        while (i < n2 && s1[i].equals(s2[i])) i++;
        while (j <= n2 && s1[n1 - j].equals(s2[n2 - j])) j++;
        return i + j > n2;
    }
}