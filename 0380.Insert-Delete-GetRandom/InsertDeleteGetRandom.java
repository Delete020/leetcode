import java.util.*;

/**
 * @author Delete020
 * @since 07/18/22 21:13 PM
 */
public class InsertDeleteGetRandom {
    Map<Integer, Integer> map;
    List<Integer> list;
    Random r;

    public InsertDeleteGetRandom() {
        map = new HashMap<>();
        list = new ArrayList<>();
        r = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int i = list.size() - 1;
        list.set(map.get(val), list.get(i));
        map.put(list.get(i), map.get(val));
        list.remove(i);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(r.nextInt(list.size()));
    }
}