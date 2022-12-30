import java.util.TreeSet;

/**
 * @author Delete020
 * @since 12/30/22 20:28 PM
 */
public class ExamRoom {
    TreeSet<Integer> set;
    int n;

    public ExamRoom(int n) {
        this.n = n;
        set = new TreeSet<>();
    }

    public int seat() {
        if (set.isEmpty()) {
            set.add(0);
            return 0;
        }
        int pre = set.first();
        int d = pre;
        int pos = 0;
        for (int cur : set) {
            if ((cur - pre) / 2 > d) {
                pos = (cur + pre) >> 1;
                d = (cur - pre) >> 1;
            }
            pre = cur;
        }
        int lastDis = n - set.last() - 1;
        if (d < lastDis) pos = n - 1;
        set.add(pos);
        return pos;
    }

    public void leave(int p) {
        set.remove(p);
    }
}