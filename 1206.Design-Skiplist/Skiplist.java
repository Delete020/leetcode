import java.util.Arrays;

/**
 * @author Delete020
 * @since 07/26/22 21:41 PM
 */
public class Skiplist {
    private static final double SKIPLIST_P = 0.25;
    private static final int MAX_LEVEL = 32;
    private final SkipNode head;
    private int curLevel;

    public Skiplist() {
        head = new SkipNode(Integer.MIN_VALUE);
        curLevel = 0;
    }

    private void find(int val, SkipNode[] nodes) {
        SkipNode cur = head;
        for (int i = curLevel - 1; i >= 0; i--) {
            while (cur.next[i] != null && cur.next[i].val < val) {
                cur = cur.next[i];
            }
            nodes[i] = cur;
        }
    }

    private int randomLevel() {
        int level = 1;
        while (Math.random() < SKIPLIST_P && level < MAX_LEVEL) {
            level++;
        }
        return level;
    }

    public boolean search(int target) {
        SkipNode[] nodePrecursor = new SkipNode[MAX_LEVEL];
        find(target, nodePrecursor);
        return nodePrecursor[0].next[0] != null && nodePrecursor[0].next[0].val == target;
    }

    public void add(int num) {
        SkipNode newNode = new SkipNode(num);
        SkipNode[] nodePrecursor = new SkipNode[MAX_LEVEL];
        Arrays.fill(nodePrecursor, head);
        find(num, nodePrecursor);

        int randomLevel = randomLevel();
        this.curLevel = Math.max(this.curLevel, randomLevel);
        for (int i = 0; i < randomLevel; i++) {
            newNode.next[i] = nodePrecursor[i].next[i];
            nodePrecursor[i].next[i] = newNode;
        }
    }

    public boolean erase(int num) {
        SkipNode[] nodePrecursor = new SkipNode[MAX_LEVEL];
        find(num, nodePrecursor);

        SkipNode delete = nodePrecursor[0].next[0];
        if (delete == null || delete.val != num) {
            return false;
        }

        for (int i = 0; i < curLevel && nodePrecursor[i].next[i] == delete; i++) {
            nodePrecursor[i].next[i] = nodePrecursor[i].next[i].next[i];
        }

        while (curLevel > 1 && head.next[curLevel - 1] != null) curLevel--;
        return true;
    }

    class SkipNode {
        int val;
        SkipNode[] next;

        public SkipNode(int val) {
            this.val = val;
            next = new SkipNode[MAX_LEVEL];
        }
    }
}