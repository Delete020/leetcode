/**
 * @author Delete020
 * @since 10/20/22 20:39 PM
 */
public class KthSymbolinGrammar {
    public int kthGrammar(int n, int k) {
        if (k == 1) return 0;
        int layer = log2(k);
        int num = k - (int) Math.pow(2, layer - 1);
        return kthGrammar(n, num) == 0 ? 1 : 0;
    }

    private int log2(int k) {
        return (int) Math.ceil(Math.log(k) / Math.log(2));
    }
}