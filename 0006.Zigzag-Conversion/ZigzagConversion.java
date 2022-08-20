/**
 * @author Delete020
 * @since 08/20/22 10:11 AM
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[] ch = s.toCharArray();
        int n = s.length();
        int mod = numRows + numRows - 2;
        int reduce = mod;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += mod) {
                sb.append(ch[j]);
                if (reduce != 0 && j + reduce < j + mod && j + reduce < n) {
                    sb.append(ch[j + reduce]);
                }
            }
            reduce -= 2;
        }

        return sb.toString();
    }
}