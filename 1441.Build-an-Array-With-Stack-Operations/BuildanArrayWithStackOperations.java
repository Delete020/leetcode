/**
 * @author Delete020
 * @since 10/15/22 21:05 PM
 */
public class BuildanArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if (i == target.length) {
                break;
            }
            if (target[i] == j) {
                res.add("Push");
                i++;
            } else {
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }
}