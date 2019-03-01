package pers.gxy.leetcode.weekly.n123;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestSubarraysWithKDifferentIntegers2 {
    @Test
    @DisplayName("Example 1")
    void e1() {
        int[] A = { 1, 2, 1, 2, 3 };
        int K = 2;
        int out = 7;
        SubarraysWithKDifferentIntegers a = new SubarraysWithKDifferentIntegers();
        int actuals = a.subarraysWithKDifferent2(A, K);
        Assert.assertEquals(out, actuals);
    }
    @Test
    @DisplayName("Example 2")
    void e2() {
        int[] A = { 2,1,2,1,2 };
        int K = 2;
        int out = 10;
        SubarraysWithKDifferentIntegers a = new SubarraysWithKDifferentIntegers();
        int actuals = a.subarraysWithKDifferent2(A, K);
        Assert.assertEquals(out, actuals);
    }
}
