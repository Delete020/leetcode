/**
 * @author Delete020
 * @since 11/15/22 22:28 PM
 */
public class MaximumUnitsonaTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int ans = 0;
        for (int[] box : boxTypes) {
            if (box[0] > truckSize) {
                ans += truckSize * box[1];
                break;
            } else {
                ans += box[0] * box[1];
                truckSize -= box[0];
            }
        }
        return ans;
    }
}