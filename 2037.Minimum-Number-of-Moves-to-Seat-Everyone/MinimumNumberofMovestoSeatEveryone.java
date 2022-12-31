import java.util.Arrays;

/**
 * @author Delete020
 * @since 12/31/22 18:52 PM
 */
public class MinimumNumberofMovestoSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        for (int i = 0; i < seats.length; i++) {
            ans += Math.abs(seats[i] - students[i]);
        }
        return ans;
    }
}