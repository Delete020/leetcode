/**
 * @author Delete020
 * @since 03/18/23 14:13 PM
 */
public class SplitTwoStringstoMakePalindrome {
    public boolean checkPalindromeFormation(String a, String b) {
        var arrayA = a.toCharArray();
        var arrayB = b.toCharArray();
        return isPalindrome(arrayA, arrayB) || isPalindrome(arrayB, arrayA);
    }

    private boolean isPalindrome(char[] a, char[] b) {
        int n = a.length;
        int i = 0;
        int j = n - 1;
        while (i < n / 2 && a[i] == b[j]) {
            i++;
            j--;
        }
        return check(a, i, j) || check(b, i, j);
    }

    private boolean check(char[] c, int i, int j) {
        while (i <= j) {
            if (c[i++] != c[j--]) return false;
        }
        return true;
    }
}