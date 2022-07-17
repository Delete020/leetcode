/**
 * @author Delete020
 * @since 07/17/22 11:13 AM
 */
public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) continue;
            int cnt = 0;
            int n = i;
            while (nums[n] != -1) {
                int cur = nums[n];
                nums[n] = -1;
                n = cur;
                cnt++;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}