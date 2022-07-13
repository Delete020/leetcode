import java.util.Stack;

/**
 * @author Delete020
 * @since 07/13/22 20:55 PM
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            boolean pushI = true;
            while (pushI && !stack.isEmpty() && stack.peek() > 0 && i < 0) {
                int peek = Math.abs(stack.peek());
                int absI = Math.abs(i);
                if (peek <= absI) stack.pop();
                if (peek >= absI) pushI = false;
            }
            if (pushI) stack.push(i);
        }

        int[] res = new int[stack.size()];
        int i = 0;
        for (int asteroid : stack) {
            res[i++] = asteroid;
        }
        return res;
    }
}