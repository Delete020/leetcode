import java.util.List;

/**
 * @author Delete020
 * @since 10/29/22 18:16 PM
 */
public class CountItemsMatchingaRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int k = 0;
        switch (ruleKey) {
            case "color" -> k = 1;
            case "name" -> k = 2;
        }
        int cnt = 0;
        for (List<String> item : items) {
            if (item.get(k).equals(ruleValue)) cnt++;
        }

        return cnt;
    }
}