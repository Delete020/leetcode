/**
 * @author Delete020
 * @since 01/19/23 21:37 PM
 */
public class StrongPasswordCheckerII {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        int mask = 0;
        char pre = '>';
        for (char c : password.toCharArray()) {
            if (c == pre) return false;
            if (Character.isLowerCase(c)) {
                mask |= 1;
            } else if (Character.isUpperCase(c)) {
                mask |= 1 << 1;
            } else if (Character.isDigit(c)) {
                mask |= 1 << 2;
            } else {
                mask |= 1 << 3;
            }
            pre = c;
        }
        return mask == 15;
    }
}