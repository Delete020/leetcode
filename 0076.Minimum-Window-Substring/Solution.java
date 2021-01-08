import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        int head = 0, tail = 0, cnt = 0, begin = 0, len = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            tail += 1;
            if (need.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (need.get(c).equals(map.get(c))) {
                    cnt += 1;
                }
            }

            while (cnt == need.size()) {
                if (len > tail - head) {
                    begin = head;
                    len = tail - head;
                }

                char left = s.charAt(head);
                if (need.containsKey(left)) {
                    if (need.get(left).equals(map.get(left))) {
                        cnt -= 1;
                    }
                    map.put(left, map.get(left) - 1);
                }
                head += 1;
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(begin, len + begin);
    }
}
