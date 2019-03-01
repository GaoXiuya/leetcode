package pers.gxy.leetcode.weekly.n123;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pers.gxy.leetcode.n3.Solution;

public class TestAddToArrayFromOfInteger {

    @Test
    @DisplayName("Example 1")
    void e1() {
        int[] A = { 1, 2, 0, 0 };
        int K = 34;
        int[] out = { 1, 2, 3, 4 };
        AddToArrayFromOfInteger a = new AddToArrayFromOfInteger();
        List<Integer> actualsList = a.addToArrayFrom(A, K);
        Integer[] actuals = new Integer[actualsList.size()];
        actualsList.toArray(actuals);
        Assert.assertArrayEquals(out, integer2intArray(actuals));
    }

    @Test
    @DisplayName("Example 2")
    void e2() {
        int[] A = { 9, 9, 9, 9 };
        int K = 1;
        int[] out = { 1, 0, 0, 0, 0 };
        AddToArrayFromOfInteger a = new AddToArrayFromOfInteger();
        List<Integer> actualsList = a.addToArrayFrom(A, K);
        Integer[] actuals = new Integer[actualsList.size()];
        actualsList.toArray(actuals);
        Assert.assertArrayEquals(out, integer2intArray(actuals));
    }

    @Test
    @DisplayName("k大于A")
    void e3() {
        int[] A = { 9 };
        int K = 11;
        int[] out = {2,0};
        AddToArrayFromOfInteger a = new AddToArrayFromOfInteger();
        List<Integer> actualsList = a.addToArrayFrom(A, K);
        Integer[] actuals = new Integer[actualsList.size()];
        actualsList.toArray(actuals);
        Assert.assertArrayEquals(out, integer2intArray(actuals));
    }
    @Test
    @DisplayName("A为空")
    void e4() {
        int[] A = { };
        int K = 11;
        int[] out = {1,1};
        AddToArrayFromOfInteger a = new AddToArrayFromOfInteger();
        List<Integer> actualsList = a.addToArrayFrom(A, K);
        Integer[] actuals = new Integer[actualsList.size()];
        actualsList.toArray(actuals);
        Assert.assertArrayEquals(out, integer2intArray(actuals));
    }

    public int[] integer2intArray(Integer[] a) {
        int[] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        return array;
    }

}
