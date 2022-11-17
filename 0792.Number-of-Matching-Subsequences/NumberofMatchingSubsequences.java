import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Delete020
 * @since 11/17/22 21:36 PM
 */
public class NumberofMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        List<TreeSet<Integer>> list = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            list.add(new TreeSet<>());
            list.get(i).add(-1);
        }

        int i = 0;
        for (char c : s.toCharArray()) {
            list.get(c - 'a').add(i++);
        }

        int ans = words.length;
        for (String word : words) {
            int pre = -1;
            Integer cur;
            for (char c : word.toCharArray()) {
                cur = list.get(c - 'a').higher(pre);
                if (cur == null) {
                    ans--;
                    break;
                }
                pre = cur;
            }
        }

        return ans;
    }
}