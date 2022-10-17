import java.util.HashSet;
import java.util.Set;

/**
 * @author Delete020
 * @since 10/17/22 21:52 PM
 */
public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        int head = 0;
        int front = 0;
        for (int i = 0; i < n; i++) {
            set.add(fruits[i]);
            if (set.size() > 2) {
                set.clear();
                set.add(fruits[front]);
                set.add(fruits[i]);
                ans = Math.max(ans, i - head);
                head = front;
            }
            if (fruits[i] != fruits[front]) {
                front = i;
            }
        }
        return Math.max(ans, n - head);
    }
}