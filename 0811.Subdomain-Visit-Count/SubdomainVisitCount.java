import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Delete020
 * @since 10/05/22 20:07 PM
 */
public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] count = cpdomain.split(" ");
            String[] domain = count[1].split("\\.");
            String subDomain = "";
            int cnt = Integer.parseInt(count[0]);
            for (int i = domain.length - 1; i >= 0; i--) {
                subDomain = domain[i] + subDomain;
                map.put(subDomain, map.getOrDefault(subDomain, 0) + cnt);
                subDomain = "." + subDomain;
            }
        }

        List<String> ans = new ArrayList<>();
        for (String k : map.keySet()) {
            ans.add(map.get(k) + " " + k);
        }

        return ans;
    }
}