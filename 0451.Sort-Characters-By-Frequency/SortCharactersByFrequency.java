import java.util.Arrays;

/**
 * @author Delete020
 * @since 11/14/22 23:08 PM
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[128][2];
        for (int i = 0; i < 128; i++) arr[i][0] = i;
        for (char c : s.toCharArray()) arr[c][1]++;
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        for (int[] a : arr) sb.append(String.valueOf((char) a[0]).repeat(a[1]));
        return sb.toString();
    }
}