import java.util.Arrays;

/**
 * @author Delete020
 * @since 08/01/22 21:20 PM
 */
public class GenerateaStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        char[] c = new char[n];
        Arrays.fill(c, 'a');
        if (n % 2 == 0) {
            c[n - 1] = 'b';
        }
        return new String(c);
    }
}