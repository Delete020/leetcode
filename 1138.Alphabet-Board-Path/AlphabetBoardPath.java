/**
 * @author Delete020
 * @since 02/12/23 12:47 PM
 */
public class AlphabetBoardPath {
    public String alphabetBoardPath(String target) {
        int[] cur = new int[]{0, 0};
        StringBuilder sb = new StringBuilder();
        for (char c : target.toCharArray()) {
            int ch = c - 'a';
            int[] pos = new int[]{ch / 5, ch % 5};
            if (cur[0] > pos[0]) sb.append(String.valueOf('U').repeat(cur[0] - pos[0]));
            if (cur[1] > pos[1]) sb.append(String.valueOf('L').repeat(cur[1] - pos[1]));
            if (cur[0] < pos[0]) sb.append(String.valueOf('D').repeat(pos[0] - cur[0]));
            if (cur[1] < pos[1]) sb.append(String.valueOf('R').repeat(pos[1] - cur[1]));
            sb.append('!');
            cur = pos;
        }
        return sb.toString();
    }
}