/**
 * @author Delete020
 * @since 07/16/22 09:41 AM
 */
public class MovingAverage {
    int[] array;
    int size;
    int index;
    double sum;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        this.size = size;
        array = new int[size];
    }

    public double next(int val) {
        sum += val - array[index % size];
        array[index % size] = val;
        return sum / Math.min(++index, size);
    }
}