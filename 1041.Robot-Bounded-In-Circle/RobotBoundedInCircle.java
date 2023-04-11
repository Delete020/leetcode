/**
 * @author Delete020
 * @since 04/11/23 21:58 PM
 */
public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int[] move = {0, 1, 0, -1, 0};
        int dir = 0, x = 0, y = 0;
        for (int i = 0; i < 4; i++) {
            for (char c : instructions.toCharArray()) {
                if (c == 'G') {
                    x += move[dir];
                    y += move[dir + 1];
                } else if (c == 'L') {
                    dir = (dir + 1) % 4;
                } else {
                    dir = (dir + 4 - 1) % 4;
                }
            }
            if (x == 0 && y == 0) return true;
        }
        return false;
    }
}