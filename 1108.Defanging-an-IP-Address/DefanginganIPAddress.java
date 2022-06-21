/**
 * @author Delete020
 * @since 6/21/22 9:43 PM
 */
public class DefanginganIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c != '.') {
                sb.append(c);
            } else {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}
