/**
 * @author Delete020
 * @since 12/24/22 23:34 PM
 */
public class LargestMergeOfTwoStrings {
    public String largestMerge(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            int cnt = 0;
            int max = Math.min(n1 - i, n2 - j);
            while (cnt != max && word1.charAt(i + cnt) == word2.charAt(j + cnt)) {
                cnt++;
            }
            if (cnt + j == n2) {
                merge.append(word1.charAt(i++));
            } else if (cnt + i == n1) {
                merge.append(word2.charAt(j++));
            } else if (word1.charAt(i + cnt) > word2.charAt(j + cnt)) {
                merge.append(word1.charAt(i++));
            } else {
                merge.append(word2.charAt(j++));
            }
        }
        merge.append(word1.substring(i));
        merge.append(word2.substring(j));
        return merge.toString();
    }
}