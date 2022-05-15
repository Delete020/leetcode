public class Solution {
    public int integerReplacement(int t) {
        long n = t;
        int res = 0;

        while (n > 1) {
            res++;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                long high = n + 1;
                if (high % 4 == 0 && high != 4) {
                    n = high;
                } else {
                    --n;
                }
            }
        }

        return res;
    }
}
