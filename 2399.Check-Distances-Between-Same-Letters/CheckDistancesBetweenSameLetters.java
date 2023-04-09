import java.util.Arrays;

/**
 * @author Delete020
 * @since 04/09/23 15:19 PM
 */
public class CheckDistancesBetweenSameLetters {
    public boolean checkDistances(String s, int[] distance) {
        int[] map = new int[26];
        Arrays.fill(map, -1);
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (map[c] != -1 && i - map[c] != distance[c] + 1) return false;
            map[c] = i;
        }
        return true;
    }
}