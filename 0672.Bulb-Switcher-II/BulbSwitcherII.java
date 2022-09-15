/**
 * @author Delete020
 * @since 09/15/22 22:00 PM
 */
public class BulbSwitcherII {
    public int flipLights(int n, int presses) {
        if (presses == 0)
            return 1;
        if (n == 1)
            return 2;
        if (n == 2)
            return 3 + (presses >= 2 ? 1 : 0);

        if (presses == 1)
            return 4;
        if (presses == 2)
            return 7;
        return 8;
    }
}