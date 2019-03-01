package pers.gxy.leetcode.n8;

/**
 * <h1><a href="https://leetcode.com/problems/string-to-integer-atoi/">8. String
 * to Integer (atoi)</a></h1>
 * 
 * 
 * 
 * <div>
 * <p>
 * Implement <code><span>atoi</span></code> which&nbsp;converts a string to an
 * integer.
 * </p>
 * 
 * <p>
 * Ï
 * The function first discards as many whitespace characters as necessary until
 * the first non-whitespace character is found. Then, starting from this
 * character, takes an optional initial plus or minus sign followed by as many
 * numerical digits as possible, and interprets them as a numerical value.
 * </p>
 * 
 * <p>
 * The string can contain additional characters after those that form the
 * integral number, which are ignored and have no effect on the behavior of this
 * function.
 * </p>
 * 
 * <p>
 * If the first sequence of non-whitespace characters in str is not a valid
 * integral number, or if no such sequence exists because either str is empty or
 * it contains only whitespace characters, no conversion is performed.
 * </p>
 * 
 * <p>
 * If no valid conversion could be performed, a zero value is returned.
 * </p>
 * 
 * <p>
 * <strong>Note:</strong>
 * </p>
 * 
 * <ul>
 * <li>Only the space character <code>' '</code> is considered as whitespace
 * character.</li>
 * <li>Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2<sup>31</sup>,&nbsp;
 * 2<sup>31&nbsp;</sup>− 1]. If the numerical value is out of the range of
 * representable values, INT_MAX (2<sup>31&nbsp;</sup>− 1) or INT_MIN
 * (−2<sup>31</sup>) is returned.</li>
 * </ul>
 * 
 * <p>
 * <strong>Example 1:</strong>
 * </p>
 * 
 * <pre>
 * <strong>Input:</strong> "42"
 *<strong>Output:</strong> 42
 * </pre>
 * 
 * <p>
 * <strong>Example 2:</strong>
 * </p>
 * 
 * <pre>
 * <strong>Input:</strong> "   -42"
 *<strong>Output:</strong> -42
 *<strong>Explanation:</strong> The first non-whitespace character is '-', which is the minus sign.
 *&nbsp;            Then take as many numerical digits as possible, which gets 42.
 * </pre>
 * 
 * <p>
 * <strong>Example 3:</strong>
 * </p>
 * 
 * <pre>
 * <strong>Input:</strong> "4193 with words"
 *<strong>Output:</strong> 4193
 *<strong>Explanation:</strong> Conversion stops at digit '3' as the next character is not a numerical digit.
 * </pre>
 * 
 * <p>
 * <strong>Example 4:</strong>
 * </p>
 * 
 * <pre>
 * <strong>Input:</strong> "words and 987"
 *<strong>Output:</strong> 0
 *<strong>Explanation:</strong> The first non-whitespace character is 'w', which is not a numerical 
 *&nbsp;            digit or a +/- sign. Therefore no valid conversion could be performed.
 * </pre>
 * 
 * <p>
 * <strong>Example 5:</strong>
 * </p>
 * 
 * <pre>
 * <strong>Input:</strong> "-91283472332"
 *<strong>Output:</strong> -2147483648
 *<strong>Explanation:</strong> The number "-91283472332" is out of the range of a 32-bit signed integer.
 * &nbsp;            Thefore INT_MIN (−2<sup>31</sup>) is returned.
 * </pre>
 * 
 * </div>
 * 
 * @author gaoxiuya
 *
 */
public class Solution {
    /**
     * runtime :16 ms
     * 
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        int num = 0;
        // System.out.println("字符串为" + str);
        char[] chars = str.toCharArray();
        char[] re = new char[chars.length];
        char s = '+';
        int index = 0;
        int head = 0;
        for (int i = 0; i < chars.length; i++) {
            int c = chars[i];
            // 去空格
            if (c <= 32 && i == head) {
                head = i + 1;
                continue;
            }
            // 开头既不是正负号也不是数字的直接返回
            if (i == head && !((47 < c && c < 58) || c == 43 || c == 45)) {
                return num;
            }
            // 遇到非数字字符结束
            if (i != head && !(47 < c && c < 58)) {
                break;
            }
            // 判断是否有符号
            if (i == head && (c == 43 || c == 45)) {
                s = (char) c;
                // System.out.println("这个数字有符号，符号为" + s);
            }
            if (47 < c && c < 58) {

                if (index == 0 && c == 48) {
                    // System.out.printf("删除首位0", index, (char) c);
                    continue;
                }
                // System.out.printf("这个数字第%d为%c\r\n", index, (char) c);
                re[index] = (char) c;
                index++;
            }

        }

        for (int i = 0; i < index; i++) {
            int c = re[i] - '0';

            if (s != '-') {
                // 溢出判断
                if (num > (Integer.MAX_VALUE - c) / 10) {
                    return Integer.MAX_VALUE;
                }
                num = num * 10 + c;
            }
            if (s == '-') {
                // 溢出判断
                if (i == 0)
                    num = 0 - c;
                else if (num < (Integer.MIN_VALUE + c) / 10) {
                    return Integer.MIN_VALUE;
                } else
                    num = num * 10 - c;
            }
            // System.out.printf("要变数字了%d\r\n", num);
        }
        return num;
    }
}