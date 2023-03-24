/**
 * @author Delete020
 * @since 03/24/23 20:40 PM
 */
public class StreamChecker {
    private final Trie root;
    StringBuilder sb;
    public StreamChecker(String[] words) {
        this.root = new Trie();
        sb = new StringBuilder();
        for (String word : words) {
            insert(word);
        }
    }

    public boolean query(char letter) {
        sb.append(letter);
        return search();
    }

    private void insert(String s) {
        Trie cur = root;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i) - 'a';
            if (cur.node[c] == null) {
                cur.node[c] = new Trie();
            }
            cur = cur.node[c];
        }
        cur.isEnd = true;
    }

    private boolean search() {
        Trie cur = root;
        for (int i = sb.length() - 1; i >= 0; i--) {
            int c = sb.charAt(i) - 'a';
            if (cur.isEnd) return true;
            if ((cur = cur.node[c]) == null) return false;
        }
        return cur.isEnd;
    }

    static class Trie {
        Trie[] node = new Trie[26];
        boolean isEnd = false;
    }
}