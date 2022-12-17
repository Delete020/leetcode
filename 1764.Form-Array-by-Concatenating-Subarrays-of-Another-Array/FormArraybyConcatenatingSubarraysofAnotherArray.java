/**
 * @author Delete020
 * @since 12/17/22 21:14 PM
 */
public class FormArraybyConcatenatingSubarraysofAnotherArray {
    public boolean canChoose(int[][] groups, int[] nums) {
        int n = groups.length;
        int m = nums.length;
        int i = 0;
        int j = 0;
        while (i < m && j != n) {
            if (nums[i] == groups[j][0] && check(groups[j], nums, i)) {
                i += groups[j++].length;
            } else {
                i++;
            }
        }
        return n == j;
    }

    private boolean check(int[] group, int[] nums, int i) {
        if (i + group.length > nums.length) return false;
        for (int g : group) {
            if (nums[i++] != g) return false;
        }
        return true;
    }
}