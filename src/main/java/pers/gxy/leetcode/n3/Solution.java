package pers.gxy.leetcode.n3;

import java.util.HashSet;
import java.util.Set;

import junit.runner.Version;

/**
 * <h1><a href=
 * "https://leetcode.com/problems/longest-substring-without-repeating-characters/">3.
 * Longest Substring Without Repeating Characters</a></h1>
 * <div>
 * <p>
 * Given a string, find the length of the <b>longest substring</b> without
 * repeating characters.
 * </p>
 * 
 * <div>
 * <p>
 * <strong>Example 1:</strong>
 * </p>
 * 
 * <pre>
 * <strong>Input: </strong><span id="example-input-1-1">"abcabcbb"</span>
<strong>Output: </strong><span id="example-output-1">3 
<strong>Explanation:</strong></span> The answer is <code>"abc"</code>, with the length of 3.
 * </pre>
 * 
 * <div>
 * <p>
 * <strong>Example 2:</strong>
 * </p>
 * 
 * <pre>
 * <strong>Input: </strong><span id="example-input-2-1">"bbbbb"</span>
<strong>Output: </strong><span id="example-output-2">1
</span><span id=
"example-output-1"><strong>Explanation: </strong>T</span>he answer is <code>"b"</code>, with the length of 1.
 * </pre>
 * 
 * <div>
 * <p>
 * <strong>Example 3:</strong>
 * </p>
 * 
 * <pre>
 * <strong>Input: </strong><span id="example-input-3-1">"pwwkew"</span>
<strong>Output: </strong><span id="example-output-3">3
</span><span id=
"example-output-1"><strong>Explanation: </strong></span>The answer is <code>"wke"</code>, with the length of 3. 
             Note that the answer must be a <b>substring</b>, <code>"pwke"</code> is a <i>subsequence</i> and not a substring.
 * </pre>
 * 
 * </div>
 * </div>
 * </div>
 * </div>
 * 
 * @author gaoxiuya
 *
 */
public class Solution {
    /**
     * 用string的自带函数实现
     * asdfghafyg
     * 用时 122ms
     * {@link Version}
     * 
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        String maxstr = "";
        // System.out.printf("==============%s===========\r\n", s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substr = s.substring(i, j + 1);
                // if (j == s.length()) {
                // System.out.printf("j指针到末尾了\r\n");
                // if (maxstr.length() < substr.length())
                // maxstr = substr;
                //
                // }
                // System.out.printf("i:%d,j:%d\r\n", i, j);
                char c = s.charAt(j);
                // System.out.printf("子串%s是否包含多个字符%s?%s\r\n", substr, c, substr.lastIndexOf(c)
                // != substr.indexOf(c));
                if (substr.lastIndexOf(c) != substr.indexOf(c)) {
                    if (maxstr.length() < substr.length()) {
                        maxstr = substr.substring(0, substr.length() - 1);
                        // if (j == s.length() - 1) {
                        // maxstr = substr;
                        // }
                    }
                    // System.out.printf("跳出内层循环,maxstr为%s,长度为%d\r\n", maxstr, maxstr.length());
                    break;
                }
                if (maxstr.length() < substr.length()) {
                    maxstr = substr.substring(0, substr.length() - 1);
                    if (j == s.length() - 1) {
                        maxstr = substr;
                    }
                }
            }
        }
        // System.out.printf("==============%s===========\r\n", s);
        // System.out.println();
        return maxstr.length();

    }

    public int lengthOfLongestSubstringV2(String s) {
        String maxstr = "";
        // System.out.printf("==============%s===========\r\n", s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                // System.out.printf("i:%d,j:%d\r\n", i, j);
                // System.out.printf("i:%s,j:%s\r\n", s.charAt(i), s.charAt(j));
                // System.out.printf("i:%d,j:%d\r\n", i+1, j);
                String substr = s.substring(i, j + 1);
                char c = s.charAt(j);
                // System.out.printf("子串为%s，字符为%s\r\n", substr, c);
                if (substr.lastIndexOf(c) != substr.indexOf(c)) {
                    // System.out.printf("子串%s是否包含多个字符%s?%s\r\n", substr, c, "true");
                    if (maxstr.length() < substr.length()) {
                        maxstr = substr.substring(0, substr.length() - 1);
                    }
                    // System.out.printf("跳出内层循环,maxstr为%s,长度为%d\r\n", maxstr, maxstr.length());
                    break;
                } else {
                    // System.out.printf("子串%s是否包含多个字符%s?%s\r\n", substr, c, "false");
                    if (maxstr.length() < substr.length()) {
                        maxstr = substr;
                    }
                }

            }
        }
        // System.out.printf("==============%s===========\r\n", s);
        // System.out.println();
        return maxstr.length();

    }

    public int lengthOfLongestSubstringV3(String s) {
        int maxstr = 0;
        // System.out.printf("==============%s===========\r\n", s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                // System.out.printf("i:%d,j:%d\r\n", i, j);
                // System.out.printf("i:%s,j:%s\r\n", s.charAt(i), s.charAt(j));
                // System.out.printf("i:%d,j:%d\r\n", i+1, j);
                String substr = s.substring(i, j + 1);
                char c = s.charAt(j);
                // System.out.printf("子串为%s，字符为%s\r\n", substr, c);
                if (substr.lastIndexOf(c) != substr.indexOf(c)) {
                    // System.out.printf("子串%s是否包含多个字符%s?%s\r\n", substr, c, "true");
                    if (maxstr < substr.length()) {
                        maxstr = substr.length() - 1;
                    }
                    // System.out.printf("跳出内层循环,maxstr为%s,长度为%d\r\n", maxstr, maxstr.length());
                    break;
                } else {
                    // System.out.printf("子串%s是否包含多个字符%s?%s\r\n", substr, c, "false");
                    if (maxstr < substr.length()) {
                        maxstr = substr.length();
                    }
                    
                }

            }
        }
        // System.out.printf("==============%s===========\r\n", s);
        // System.out.println();
        return maxstr;

    }

    public int lengthOfLongestSubstringV4(String s) {
        int n = s.length();
          System.out.printf("==============%s===========\r\n", s);
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            System.out.printf("i:%d,j:%d\r\n", i, j);
            System.out.printf("i:%s,j:%s\r\n", s.charAt(i), s.charAt(j));
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                j=j+1;
                set.add(s.charAt(j));
                ans = Math.max(ans, j - i);
            } else {
                i=i+1;
                set.remove(s.charAt(i));
            }
        }
         System.out.printf("==============%s===========\r\n", s);
         System.out.println();
        return ans;
    }
     
}