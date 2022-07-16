/**
 * @author Delete020
 * @since 07/16/22 09:41 AM
 */
public class MovingAverage {
    int[] array;
    int size;
    int index;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        this.size = size;
        array = new int[10001];
        index = 1;
    }

    public double next(int val) {
        array[index] = array[index - 1] + val;
        if (index < size) {
            return array[index] / (double) index++;
        }
        return (array[index] - array[(index++) - size]) / (double) size;
    }
}