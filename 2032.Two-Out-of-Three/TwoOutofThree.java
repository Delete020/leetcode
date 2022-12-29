import java.util.ArrayList;
import java.util.List;

/**
 * @author Delete020
 * @since 12/29/22 19:41 PM
 */
public class TwoOutofThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] cnt = new int[101];
        int[] cnt1 = new int[101];
        int[] cnt2 = new int[101];
        List<Integer> ans = new ArrayList<>();
        for (int i : nums1) cnt[i] = 1;
        for (int i : nums2) cnt1[i] = 1;
        for (int i : nums3) cnt2[i] = 1;
        for (int i = 0; i < 101; i++) {
            if (cnt[i] + cnt1[i] + cnt2[i] > 1) ans.add(i);
        }
        return ans;
    }
}