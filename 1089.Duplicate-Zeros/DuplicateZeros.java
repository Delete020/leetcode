import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Delete020
 * @since 6/17/22 2:09 PM
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;

        while (i < arr.length && arr[i] != 0) {
            i++;
        }

        for (; i < arr.length; i++) {
            int number = arr[i];
            if (number == 0) {
                queue.offer(number);
                queue.offer(number);
            } else {
                queue.offer(number);
            }
            arr[i] = queue.poll();
        }
    }
}
