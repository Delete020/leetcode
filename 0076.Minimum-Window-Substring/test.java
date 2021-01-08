import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void test1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Solution sol = new Solution();

        String actual = sol.minWindow(s, t);
        String expect = "BANC";
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test2() {
        String s = "a";
        String t = "b";
        Solution sol = new Solution();

        String actual = sol.minWindow(s, t);
        String expect = "";
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test3() {
        String s = "aa";
        String t = "aa";
        Solution sol = new Solution();

        String actual = sol.minWindow(s, t);
        String expect = "aa";
        Assert.assertEquals(expect, actual);
    }
}
