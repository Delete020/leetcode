/**
 * @author Delete020
 * @since 10/01/22 13:02 PM
 */
public class ReformatPhoneNumber {
    public String reformatNumber(String number) {
        number = number.replace(" ", "");
        number = number.replace("-", "");
        int n = number.length();
        char[] c = number.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (n > 4) {
            sb.append(c, i * 3, 3).append('-');
            i++;
            n -= 3;
        }

        if (n < 4) {
            sb.append(c, i * 3, n);
        } else {
            sb.append(c, i * 3, 2);
            sb.append('-');
            sb.append(c, i * 3 + 2, 2);
        }

        return sb.toString();
    }
}