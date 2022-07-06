/**
 * @author Delete020
 * @since 07/06/22 22:26 PM
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            swap(left++, right--, s);
        }
    }

    private void swap(int a, int b, char[] s) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}