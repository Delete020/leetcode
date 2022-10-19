/**
 * @author Delete020
 * @since 10/19/22 21:55 PM
 */
public class NumberofStudentsUnabletoEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] map = new int[2];
        for (int student : students) {
            map[student]++;
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (map[sandwiches[i]] > 0) map[sandwiches[i]]--;
            else break;
        }
        return map[0] + map[1];
    }
}