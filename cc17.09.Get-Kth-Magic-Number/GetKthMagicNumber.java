import java.util.TreeSet;

/**
 * @author Delete020
 * @since 9/28/22 10:39 PM
 */
public class GetKthMagicNumber {
    public int getKthMagicNumber(int k) {
        int[] factors = new int[]{3, 5, 7};
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        while (k > 1) {
            long i = set.first();
            set.remove(i);
            for (int factor : factors) {
                set.add(i * factor);
            }
            k--;
        }
        return set.first().intValue();
    }
}
