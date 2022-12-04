/**
 * @author Delete020
 * @since 12/04/22 12:34 PM
 */
public class ClosestDessertCost {
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int ans = 100000007;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        for (int cost : toppingCosts) {
            List<Integer> list = new ArrayList<>();
            for (int v : set) {
                // if (v + cost > target) break;
                list.add(v + cost);
                list.add(v + cost + cost);
            }
            set.addAll(list);
        }

        for (int cost : baseCosts) {
            Integer cell = set.ceiling(target - cost);
            Integer floor = set.floor(target - cost);
            cell = cell == null ? cost : cost + cell;
            floor = floor == null ? cost : cost + floor;
            if (Math.abs(cell - target) < Math.abs(target - ans)) ans = cell;
            if (Math.abs(target - floor) <= Math.abs(target - ans)) {
                if (Math.abs(target - floor) == Math.abs(target - ans)) ans = Math.min(ans, floor);
                else ans = floor;
            }
        }
        return ans;
    }
}