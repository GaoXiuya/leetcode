package pers.gxy.leetcode.n29;

public class Snippet {
    public static void main(String[] args) {

        Solution1 s = new Solution1();
        System.out.println(s.divide(100, 3));

    }
}

class Solution1 {
    public int divide(int dividend, int divisor) {
        // 首先处理Integer的最小值溢出问题（和我思路一样）
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        // 判断结果符号（这个写法比我的号，但是结果的时候用到了乘法，难道符合题意？？费解🧐）
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        // 取被除数最大值
        long dvd = Math.abs((long) dividend);
        // 取除数最大值
        long dvs = Math.abs((long) divisor);
        // 定义结果
        int res = 0;
        // 循环条件：当被除数大于等于除数时候
        while (dvd >= dvs) {
            // 为防止溢出,这里使用long类型
            long temp = dvs;
            long mult = 1;
            // << 移位操作,向左移动1位
//            System.out.printf("temp-%04d，二进制%16s\r\n", temp, Long.toBinaryString(temp));
//            System.out.printf("mult%04d，二进制%16s\r\n", mult, Long.toBinaryString(mult));
//            System.out.printf("dvd是%d,temp是%d，mult是%d,res是%d\r\n", dvd,temp, mult, res);
            while (dvd >= (temp << 1)) {

                // temp 向左移动一位就是temp=temp*2，;
                temp <<= 1;
                // 操作次数mult也增加
                // System.out.printf("%04d，二进制%16s\r\n", temp, Long.toBinaryString(temp));
                mult <<= 1;
//                System.out.printf("temp-%04d，二进制%16s\r\n", temp, Long.toBinaryString(temp));
//                System.out.printf("mult%04d，二进制%16s\r\n", mult, Long.toBinaryString(mult));
            }
            System.out.printf("%d里面有,2的%d次方个%d\r\n", dvd, mult, dvs);
//            System.out.printf("dvd是%d,temp是%d，mult是%d,res是%d\r\n", dvd,temp, mult, res);
            dvd -= temp;
            res += mult;
             
        }

        return res * sign;
    }

}
