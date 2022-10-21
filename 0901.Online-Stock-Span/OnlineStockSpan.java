import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 10/21/22 20:33 PM
 */
public class OnlineStockSpan {
    private List<Pair<Integer, Integer>> list;

    public StockSpanner() {
        list = new ArrayList<>();
        list.add(new Pair(100000000, 1));
    }

    public int next(int price) {
        int index = list.size();
        while (index > 0 && list.get(index - 1).getKey() <= price) {
            index -= list.get(index - 1).getValue();
        }
        list.add(new Pair(price, list.size() - index + 1));
        return list.size() - index;
    }
}