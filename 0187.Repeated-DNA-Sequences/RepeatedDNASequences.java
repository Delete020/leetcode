import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Delete020
 * @since 07/15/22 23:56 PM
 */
public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) return new ArrayList<>();
        Set<String> res = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int hash = 0;
        int mul = (int) Math.pow(4, 9);

        for (char ch : s.toCharArray()) {
            right++;
            int c = 0;
            switch (ch) {
                case ('A') -> c = 1;
                case ('C') -> c = 2;
                case ('G') -> c = 3;
                case ('T') -> c = 4;
            }
            hash = hash * 4 + c;
            while (right - left == 10) {
                if (set.contains(hash)) {
                    res.add(s.substring(left, right));
                } else {
                    set.add(hash);
                }
                char remove = s.charAt(left);
                switch (remove) {
                    case ('A') -> hash -= mul;
                    case ('C') -> hash -= 2 * mul;
                    case ('G') -> hash -= 3 * mul;
                    case ('T') -> hash -= 4 * mul;
                }
                left++;
            }
        }

        return new ArrayList<>(res);
    }
}