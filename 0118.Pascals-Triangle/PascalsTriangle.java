import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 08/11/22 21:07 PM
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        res.add(row1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> pre = res.get(i - 1);
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(pre.get(j) + pre.get(j - 1));
            }
            list.add(1);
            res.add(list);
        }

        return res;
    }
}