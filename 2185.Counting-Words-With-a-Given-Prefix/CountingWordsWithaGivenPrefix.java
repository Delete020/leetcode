import java.util.Arrays;

/**
 * @author Delete020
 * @since 01/08/23 11:15 AM
 */
public class CountingWordsWithaGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        return (int) Arrays.stream(words).filter(x -> x.startsWith(pref)).count();
    }
}