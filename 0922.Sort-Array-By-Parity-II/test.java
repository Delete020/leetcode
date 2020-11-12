import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void test01() {
        Solution sol = new Solution();
        int[] input = {4, 2, 5, 7};
        int[] expect = {2, 5, 4, 7};
        int[] actual = sol.sortArrayByParityII(input);
        Assert.assertArrayEquals(expect, actual);
    }

}
