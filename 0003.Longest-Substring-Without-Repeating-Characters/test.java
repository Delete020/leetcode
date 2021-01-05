import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void test1() {
        String s = "abba";
        Solution sol = new Solution();
        int result = sol.lengthOfLongestSubstring(s);
        int expect = 2;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void test2() {
        String s = "abcabcabc";
        Solution sol = new Solution();
        int result = sol.lengthOfLongestSubstring(s);
        int expect = 3;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void test3() {
        String s = "asjrgapa";
        Solution sol = new Solution();
        int result = sol.lengthOfLongestSubstring(s);
        int expect = 6;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void test4() {
        String s = "dvdf";
        Solution sol = new Solution();
        int result = sol.lengthOfLongestSubstring(s);
        int expect = 3;
        Assert.assertEquals(expect, result);
    }
}