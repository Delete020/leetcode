/**
 * @author Delete020
 * @since 09/07/22 21:19 PM
 */
public class RearrangeSpacesBetweenWords {
    public String reorderSpaces(String text) {
        char[] c = text.toCharArray();
        int cnt = 0;
        for (char ch : c) {
            if (ch == ' ') cnt++;
        }

        String[] word = text.split(" ");
        int i = 0;
        for (String s : word) {
            if (!s.isEmpty()) {
                word[i++] = s;
            }
        }

        StringBuilder sb = new StringBuilder();
        cnt = i - 1 > 0 ? cnt / (i - 1) : 0;

        String blank = "";
        for (int j = 0; j < cnt; j++) {
            blank += " ";
        }

        sb.append(word[0]);
        for (int j = 1; j < i; j++) {
            sb.append(blank);
            sb.append(word[j]);
        }

        while (sb.length() < text.length()) {
            sb.append(' ');
        }

        return sb.toString();
    }
}