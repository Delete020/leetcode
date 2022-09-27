/**
 * @author Delete020
 * @since 9/27/22 9:17 PM
 */
public class CheckPermutation {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum1 += s1.charAt(i) * s1.charAt(i);
            sum2 += s2.charAt(i) * s2.charAt(i);
        }
        return sum1 == sum2;
    }
}
