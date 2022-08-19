/**
 * @author Delete020
 * @since 08/19/22 22:11 PM
 */
public class NumberofStudentsDoingHomeworkataGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                ans++;
            }
        }
        return ans;
    }
}