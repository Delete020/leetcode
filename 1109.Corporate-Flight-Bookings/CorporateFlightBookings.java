/**
 * @author Delete020
 * @since 07/13/22 21:06 PM
 */
public class CorporateFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] sum = new int[n + 2];
        for (int[] book : bookings) {
            sum[book[0]] += book[2];
            sum[book[1] + 1] -= book[2];
        }

        int[] res = new int[n];
        int pre = 0;
        for (int i = 0; i < n; i++) {
            res[i] = pre + sum[i + 1];
            pre = res[i];
        }
        return res;
    }
}