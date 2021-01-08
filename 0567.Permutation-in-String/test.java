import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void test1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        Solution sol = new Solution();

        boolean ans = sol.checkInclusion(s1, s2);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        String s1 = "adc";
        String s2 = "dcda";
        Solution sol = new Solution();

        boolean ans = sol.checkInclusion(s1, s2);
        Assert.assertTrue(ans);
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "ooolleoooleh";
        Solution sol = new Solution();

        boolean ans = sol.checkInclusion(s1, s2);
        Assert.assertFalse(ans);
    }
}
