/**
 * @author Delete020
 * @since 12/09/22 22:42 PM
 */
public class CheckifNumberisaSumofPowersofThree {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 != 0 && --n % 3 != 0) return false;
            n /= 3;
        }
        return true;
    }
}