/**
 * @author Delete020
 * @since 07/15/22 23:58 PM
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int L = needle.length();
        int R = 26;
        char A = 'a' - 1;
        int matchHash = 0;
        int hash = 0;
        int Q = 1658598167;
        int left = 0;
        int right = 0;
        int mul = 1;

        for (int i = 1; i <= L - 1; i++) {
            mul = (mul * R) % Q;
        }

        for (char c : needle.toCharArray()) {
            matchHash = ((matchHash * mul) % Q + c - A) % Q;
        }

        for (char ch : haystack.toCharArray()) {
            right++;
            int c = ch - A;
            hash = ((hash * mul) % Q + c) % Q;

            while (right - left == L) {
                if (matchHash == hash) {
                    if (needle.equals(haystack.substring(left, right))) {
                        return left;
                    }
                }
                hash = (hash - ((haystack.charAt(left++) - A) * mul) % Q) % Q;
            }
        }

        return -1;
    }
}