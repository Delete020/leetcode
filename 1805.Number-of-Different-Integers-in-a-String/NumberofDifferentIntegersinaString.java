/**
 * @author Delete020
 * @since 12/07/22 21:50 PM
 */
public class NumberofDifferentIntegersinaString {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) {
                int j = i;
                while (j < n && Character.isDigit(word.charAt(j))) j++;
                while (i < j && word.charAt(i) == '0') i++;
                set.add(word.substring(i, j));
                i = j;
            }
        }

        return set.size();
    }
}