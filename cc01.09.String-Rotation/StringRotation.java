/**
 * @author Delete020
 * @since 9/29/22 9:39 PM
 */
public class StringRotation {
    public boolean isFlipedString(String s1, String s2) {
        if (s2.length() != s1.length()) return false;
        s2 += s2;
        return s2.contains(s1);
    }
}
