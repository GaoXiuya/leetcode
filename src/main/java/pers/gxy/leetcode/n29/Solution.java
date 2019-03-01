package pers.gxy.leetcode.n29;

public class Solution {
    public int divide(int dividend, int divisor) {
        // 符号相同用减法
        if(dividend==Integer.MIN_VALUE&&divisor==-1) {
            return Integer.MAX_VALUE;
        }
        
        if ((dividend ^ divisor) >= 0) {
            return getQuotientUsesSubtraction(dividend, divisor);
        } else {
            int absDividend = Math.abs(dividend);
            int absDivisor = Math.abs(divisor);
            if (absDividend < 0) {
                absDivisor = -absDivisor;
            } else if (absDivisor < 0) {
                absDividend = -absDividend;
            }
            return 0 - getQuotientUsesSubtraction(absDividend, absDivisor);
        }
    }

    /**
     * 使用减法获取两个数的商 除数dividend，被除数divisor
     * 条件：dividend*divisor >0 且divisor>0
     */
    private int getQuotientUsesSubtraction(int dividend, int divisor) {
        int quotient = 0;
        if (dividend >= 0)
            while (dividend >= divisor) {
                quotient++;
                dividend = dividend - divisor;
            }
        else {
            while (dividend <= divisor) {
                quotient++;
                dividend = dividend - divisor;
            }
        }
        return quotient;

    }
}