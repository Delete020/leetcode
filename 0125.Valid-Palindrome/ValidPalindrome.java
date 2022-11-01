/**
 * @author Delete020
 * @since 11/01/22 23:09 PM
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            while (l < n && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (r >= 0 && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (l == n || r == 0) return true;
            if (Character.toLowerCase(s.charAt(l)) != (Character.toLowerCase(s.charAt(r)))) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}