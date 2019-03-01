package pers.gxy.leetcode.n1;

/**
 *
 * <h1><a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a></h1>
 * <div>
 * <p>
 * Given an array of integers, return <strong>indices</strong> of the two
 * numbers such that they add up to a specific target.
 * </p>
 * 
 * <p>
 * You may assume that each input would have <strong><em>exactly</em></strong>
 * one solution, and you may not use the <em>same</em> element twice.
 * </p>
 * 
 * <p>
 * <strong>Example:</strong>
 * </p>
 * 
 * <pre>
 * Given nums = [2, 7, 11, 15], target = 9,

Because nums[<strong>0</strong>] + nums[<strong>1</strong>] = 2 + 7 = 9,
return [<strong>0</strong>, <strong>1</strong>].
 * </pre>
 * 
 * <p>
 * &nbsp;
 * </p>
 * </div>
 * 
 * @author gaoxiuya
 *
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] re = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num_j = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == num_j) {
                    re[0] = i;
                    re[1] = j;
                }
            }
        }
        return re;
    }
}