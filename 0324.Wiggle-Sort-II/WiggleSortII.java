import java.util.Arrays;

/**
 * @author Delete020
 * @since 6/28/22 8:37 PM
 */
public class WiggleSortII {
    public void wiggleSort(int[] nums) {
        int[] sort = nums.clone();
        Arrays.sort(sort);
        int mid = nums.length % 2 == 0 ? nums.length / 2 - 1 : nums.length / 2;
        System.out.println(mid);
        System.out.println(nums.length);
        for (int i = 0, j = mid, x = nums.length - 1; i < nums.length; i++) {
            nums[i] = i % 2 == 0 ? sort[j--] : sort[x--];
        }
    }
}
