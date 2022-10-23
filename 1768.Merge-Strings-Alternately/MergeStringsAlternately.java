/**
 * @author Delete020
 * @since 10/23/22 09:36 AM
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int n = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (word1.length() > n) {
            sb.append(word1.substring(n));
        } else {
            sb.append(word2.substring(n));
        }
        return sb.toString();
    }
}