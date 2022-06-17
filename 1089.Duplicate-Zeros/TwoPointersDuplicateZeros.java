/**
 * @author Delete020
 * @since 6/17/22 2:09 PM
 */
public class TwoPointersDuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        int j = 0;
        int length = arr.length;

        while (j < length) {
            if (arr[i] == 0) {
                j++;
            }
            j++;
            i++;
        }
        j--;
        i--;

        while (i >= 0) {
            if (i == j) {
                break;
            }
            if (j < length) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                arr[--j] = 0;
            }
            j--;
            i--;
        }
    }
}
