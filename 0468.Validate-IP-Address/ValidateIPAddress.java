/**
 * @author Delete020
 * @since 5/29/22 3:39 PM
 */
public class ValidateIPAddress {
    public String validIPAddress(String queryIP) {
        if (queryIP.indexOf('.') > 0 && check4(queryIP)) {
            return "IPv4";
        } else if (queryIP.indexOf(':') > 0 && check6(queryIP)) {
            return "IPv6";
        }

        return "Neither";
    }

    private boolean check4(String queryIP) {
        String[] ip = queryIP.split("\\.", -1);
        if (ip.length != 4) {
            return false;
        }

        for (String s : ip) {
            int length = s.length();
            if (length > 3 || length == 0) {
                return false;
            }
            if (length != 1 && s.charAt(0) == '0') {
                return false;
            }
            try {
                if (Integer.parseInt(s) > 255) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    private boolean check6(String queryIP) {
        String[] ip = queryIP.split(":", -1);
        if (ip.length != 8) {
            return false;
        }

        for (String s : ip) {
            int length = s.length();
            if (length > 4 || length == 0) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!Character.isDigit(c) && !(Character.toLowerCase(c) >= 'a') || !(Character.toLowerCase(c) <= 'f')) {
                    return false;
                }
            }
        }
        return true;
    }
}
