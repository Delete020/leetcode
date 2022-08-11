/**
 * @author Delete020
 * @since 08/11/22 21:02 PM
 */
public class ReformatTheString {
    public String reformat(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < n && j < n) {
            while (i < n && c[i] >= 'a' && c[i] <= 'z') {
                i++;
            }
            while (j < n && c[j] >= '0' && c[j] <= '9') {
                j++;
            }
            if (i < n && j < n) {
                sb.append(c[i++]);
                sb.append(c[j++]);
            }
        }

        if (sb.length() + 1 == n) {
            if (i == n) {
                sb.insert(0, c[j]);
            } else {
                sb.append(c[i]);
            }
        }

        return sb.length() == n ? sb.toString() : "";
    }
}