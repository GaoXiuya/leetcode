package pers.gxy.leetcode.n29;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("不用乘除取模运算计算除数")
public class TestSolution {
    @Test
    @DisplayName("MIN_VALUE情况和1")
    void e1() {
        int out = Integer.MIN_VALUE;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(Integer.MIN_VALUE, 1));
    }
    @Test
    @DisplayName("MIN_VALUE情况和-1")
    void e9() {
        int out = Integer.MAX_VALUE;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(Integer.MIN_VALUE, -1));
    }

    @Test
    @DisplayName("除数是0情况")
    void e2() {
        int out = 0;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(0, 1));
    }

    @Test
    @DisplayName("符号相反")
    void e3() {
        int out = -1;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(1, -1));
    }

    @Test
    @DisplayName("符号相同")
    void e4() {
        int out = 1;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(-1, -1));
    }

    @Test
    @DisplayName("除数MIN_VALUE和被除数MAX_VALUE")
    void e5() {
        int out = -1;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("除数MAX_VALUE和被除数MIN_VALUE")
    void e6() {
        int out = 0;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    @DisplayName("冒烟测试10,3")
    void e7() {
        int out = 3;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(10, 3));
    }

    @Test
    @DisplayName("冒烟测试7,-3")
    void e8() {
        int out = -2;
        Solution s = new Solution();
        Assert.assertEquals(out, s.divide(7, -3));
    }

}
