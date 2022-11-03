/**
 * @author Delete020
 * @since 11/03/22 20:15 PM
 */
public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(' ');
        }
        sb.deleteCharAt(s.length());
        return sb.toString();
    }
}