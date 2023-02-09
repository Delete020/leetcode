import java.util.HashMap;
import java.util.Map;

/**
 * @author Delete020
 * @since 02/09/23 21:29 PM
 */
public class DesignAuthenticationManager {
    private int timeToLive;
    private Map<String, Integer> map;

    public DesignAuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        map = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        if (!map.containsKey(tokenId) || map.get(tokenId) + timeToLive <= currentTime) return;
        map.put(tokenId, currentTime);
    }

    public int countUnexpiredTokens(int currentTime) {
        int ans = 0;
        for (int i : map.values()) {
            if (i + timeToLive > currentTime) ans++;
        }
        return ans;
    }
}