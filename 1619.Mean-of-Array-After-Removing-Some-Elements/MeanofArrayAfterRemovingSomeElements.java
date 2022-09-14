/**
 * @author Delete020
 * @since 09/14/22 21:40 PM
 */
public class MeanofArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return Arrays.stream(arr).skip((int) (n * 0.05)).limit((int) (n * 0.9)).average().getAsDouble();
    }
}