/**
 * @author Delete020
 * @since 07/07/22 20:55 PM
 */
public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            for (String root : dictionary) {
                if (s.startsWith(root)) {
                    s = root;
                    break;
                }
            }
            sb.append(s + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}