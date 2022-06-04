import java.util.HashSet;
import java.util.Set;

/**
 * @author Delete020
 * @since 6/4/22 12:42 PM
 */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<>();

        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            int at = email.indexOf('@');
            int plus = email.indexOf('+') == -1 ? at : email.indexOf('+');

            for (int i = 0; i < at && i < plus; ) {
                int dot = email.indexOf('.', i);
                if (dot > at) {
                    dot = at;
                }
                if (dot > plus) {
                    dot = plus;
                }
                sb.append(email, i, dot);
                i = dot + 1;
            }
            sb.append(email.substring(at));

            res.add(sb.toString());
        }

        return res.size();
    }
}
