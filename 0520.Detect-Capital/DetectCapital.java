/**
 * @author Delete020
 * @since 11/01/22 23:07 PM
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        boolean f = Character.isLowerCase(word.charAt(1));
        if (!f && Character.isLowerCase(word.charAt(0))) return false;
        for (int i = 2; i < word.length(); i++) {
            if (f && Character.isUpperCase(word.charAt(i))) return false;
            if (!f && Character.isLowerCase(word.charAt(i))) return false;
        }
        return true;
    }
}