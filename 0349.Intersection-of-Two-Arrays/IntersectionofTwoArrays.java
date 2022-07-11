import java.util.stream.IntStream;

/**
 * @author Delete020
 * @since 07/11/22 20:58 PM
 */
public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        return IntStream.of(nums1).filter(n1 -> IntStream.of(nums2).anyMatch(n2 -> n1 == n2)).distinct().toArray();
    }
}