/**
 * @author Delete020
 * @since 08/24/22 21:45 PM
 */
public class MakeTwoArraysEqualbyReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] b = new int[1001];
        for (int i = 0; i < target.length; i++) {
            b[target[i]]++;
            b[arr[i]]--;
        }
        for (int i : b) {
            if (i != 0) return false;
        }
        return true;
    }
}