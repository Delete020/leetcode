/**
 * @author Delete020
 * @since 01/27/23 08:19 AM
 */
public class GreatestEnglishLetterinUpperandLowerCase {
    public String greatestLetter(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) lower[c - 'a'] = 1;
            else upper[c - 'A'] = 1;
        }
        for (int i = 25; i >= 0; i--) {
            if (lower[i] + upper[i] == 2) return (char) (i + 'A') + "";
        }
        return "";
    }
}