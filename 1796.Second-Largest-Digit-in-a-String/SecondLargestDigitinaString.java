/**
 * @author Delete020
 * @since 12/03/22 12:13 PM
 */
public class SecondLargestDigitinaString {
    public int secondHighest(String s) {
        var num = new boolean[10];
        for (var c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num[c - '0'] = true;
            }
        }
        var flag = false;
        for (var i = num.length - 1; i >= 0; i--) {
            if (flag && num[i]) return i;
            if (num[i]) flag = true;
        }
        return -1;
    }
}