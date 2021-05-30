import org.junit.Assert;
import org.junit.Test;

/**
 * @author cancel
 * @since 5/19/21 5:22 PM
 */
public class test {

    @Test
    public void test1() {
        Solution sol = new Solution();
        int[] num1 = {1,3};
        int[] num2 = {2,4};
        double result = sol.findMedianSortedArrays(num1, num2);
        Assert.assertEquals(2.50, result, 0);
    }

    @Test
    public void test2() {
        Solution sol = new Solution();
        int[] num1 = {1,3};
        int[] num2 = {2};
        double result = sol.findMedianSortedArrays(num1, num2);
        Assert.assertEquals(2.0, result, 0);
    }

    @Test
    public void test3() {
        Solution sol = new Solution();
        int[] num1 = {0,0};
        int[] num2 = {0,0};
        double result = sol.findMedianSortedArrays(num1, num2);
        Assert.assertEquals(0.0, result, 0);
    }

    @Test
    public void test4() {
        Solution sol = new Solution();
        int[] num1 = {2};
        int[] num2 = {};
        double result = sol.findMedianSortedArrays(num1, num2);
        Assert.assertEquals(2.0, result, 0);
    }

    @Test
    public void test5() {
        Solution sol = new Solution();
        int[] num1 = {};
        int[] num2 = {1};
        double result = sol.findMedianSortedArrays(num1, num2);
        Assert.assertEquals(1.0, result, 0);
    }
}
