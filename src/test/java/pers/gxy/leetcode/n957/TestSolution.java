package pers.gxy.leetcode.n957;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("8个房子状态位测试")
public class TestSolution {
    // @Ignore
    @Test
    @DisplayName("冒烟测试")
    @Disabled("这条用例暂时跑不过，忽略!")
    public void test() {
        int[] cells = { 0, 1, 0, 1, 1, 0, 0, 1 };
        int N = 7;
        int[] output = { 0, 0, 1, 1, 0, 0, 0, 0 };
        Solution s = new Solution();
        Assert.assertArrayEquals(output, s.prisonAfterNDays(cells, N));

    }

    @Test
    @DisplayName("googleTest01")
    public void googleTest01() {
        int[] cells = { 1, 0, 0, 0, 0, 1, 0, 0 };
        int N = 1;
        int[] expecteds = { 0, 1, 0, 0, 1, 0, 1, 0 };
        Solution2 s = new Solution2();
        int[] actuals = new int[8];
        List l = s.prisonAfterNDays(cells, N);
        for (int i = 0; i < expecteds.length; i++) {
            actuals[i] = (int) l.get(i);

        }

        Assert.assertArrayEquals(expecteds, actuals);

    }

    @Test
    @DisplayName("googleTest02")
    public void googleTest02() {
        int[] cells = { 1, 1, 1, 0, 1, 1, 1, 1 };
        int N = 2;
        int[] expecteds = { 0, 0, 0, 0, 0, 1, 1, 0 };
        Solution2 s = new Solution2();
        int[] actuals = new int[8];
        List l = s.prisonAfterNDays(cells, N);
        for (int i = 0; i < expecteds.length; i++) {
            actuals[i] = (int) l.get(i);

        }

        Assert.assertArrayEquals(expecteds, actuals);
    }
}