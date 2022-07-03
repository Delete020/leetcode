/**
 * @author Delete020
 * @since 07/03/22 15:50 PM
 */
public class NextGreaterElementIII {
    public int nextGreaterElement(int N) {
        if (N < 10) return -1;
        char[] c = ("" + N).toCharArray();
        int n = c.length;
        int i = n - 2;

        while (i >= 0 && c[i] >= c[i + 1]) {
            i--;
        }
        if (i < 0) return -1;

        int j = n - 1;
        while (j > i && c[j] <= c[i]) {
            j--;
        }

        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;

        i++;
        j = n - 1;
        while (i < j) {
            char t = c[i];
            c[i++] = c[j];
            c[j--] = t;
        }

        try {
            return Integer.parseInt(new String(c));
        } catch (Exception e) {
            return -1;
        }
    }
}