package pers.gxy.leetcode.n3;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("最长不重复子串测试-V4")
public class TestSolutionV4 {
    @Test
    @DisplayName("Example 1")
    void e1() {
        String in = "abcabcbb";
        int out = 3;
        Solution s = new Solution();
        Assert.assertEquals(out, s.lengthOfLongestSubstringV4(in));
    }

    @Test
    @DisplayName("Example 2")
    void e2() {
        String in = "bbbb";
        int out = 1;
        Solution s = new Solution();
        Assert.assertEquals(out, s.lengthOfLongestSubstringV4(in));

    }

    @Test
    @DisplayName("Example 3")
    void e3() {
        String in = "pwwkew";
        int out = 3;
        Solution s = new Solution();
        Assert.assertEquals(out, s.lengthOfLongestSubstringV4(in));

    }

    @Test
    @DisplayName("没有重复的字符串")
    void e4() {
        String in = "asdfghjkoiuytrew";
        int out = in.length();
        Solution s = new Solution();
        Assert.assertEquals(out, s.lengthOfLongestSubstringV4(in));

    }

    @Test
    @DisplayName("开头重复的字符串")
    void e5() {
        String in = "aab";
        int out = 2;
        Solution s = new Solution();
        Assert.assertEquals(out, s.lengthOfLongestSubstringV4(in));

    }

    @Test
    @DisplayName("abcdeca")
    void e6() {
        String in = "abcdeca";
        int out = 5;
        Solution s = new Solution();
        Assert.assertEquals(out, s.lengthOfLongestSubstring(in));

    }
}
