/**
 * @author Delete020
 * @since 01/06/23 23:07 PM
 */
public class CountIntegersWithEvenDigitSum {
    public int countEven(int num) {
        int sum = 0;
        int n = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (n % 2 == 0 && sum % 2 == 1) return n / 2 - 1;
        return n / 2;
    }
}