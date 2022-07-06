import java.util.Arrays;

/**
 * @author Delete020
 * @since 7/6/22 10:18 PM
 */
public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        int[] need = new int[26];
        char A = 'a';
        for (char c : s1.toCharArray()) {
            need[c - A]--;
        }

        int length = s1.length();
        int left = 0;
        for (int i = 0; i < s2.length(); i++) {
            int c = s2.charAt(i) - A;
            need[c]++;
            while (need[c] > 0) {
                need[s2.charAt(left++) - A]--;
            }
            if (i - left + 1 == length) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInclusion2(String s1, String s2) {
        int[] need = new int[26];
        int[] window = new int[26];
        char A = 'a';
        for (char c : s1.toCharArray()) {
            need[c - A]++;
        }

        int length = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            if (i >= length) {
                window[s2.charAt(i - length) - A]--;
            }
            window[s2.charAt(i) - A]++;
            if (Arrays.equals(need, window)) {
                return true;
            }
        }
        return false;
    }
}
