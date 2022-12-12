/**
 * @author Delete020
 * @since 12/12/22 22:42 PM
 */
public class SumofBeautyofAllSubstrings {
    public int beautySum(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n - 2; i++) {
            int[] dir = new int[26];
            int min = s.charAt(i) - 'a';
            int max = 1;
            dir[min]++;
            for (int j = i + 1; j < n; j++) {
                int c = s.charAt(j) - 'a';
                max = Math.max(++dir[c], max);
                if (dir[min] > dir[c]) min = c;
                if (c == min) {
                    for (int k = 0; k < 26; k++) {
                        if (dir[k] != 0 && dir[k] < dir[min]) min = k;
                    }
                }
                res += max - dir[min];
            }
        }
        return res;
    }
}