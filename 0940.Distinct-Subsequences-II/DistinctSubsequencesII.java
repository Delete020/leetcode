/**
 * @author Delete020
 * @since 10/14/22 22:02 PM
 */
public class DistinctSubsequencesII {
    public int distinctSubseqII(String s) {
        long[] alphabet = new long[26];
        int MOD = (int) 1e9 + 7;
        long sum = 0;
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            long pre = alphabet[index];
            alphabet[index] = sum + 1;
            sum = (sum - pre + alphabet[index] + MOD) % MOD;
        }
        return (int) sum;
    }
}