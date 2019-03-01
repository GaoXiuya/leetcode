package pers.gxy.leetcode;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Math.abs(Integer.MIN_VALUE);
        int min=Integer.MIN_VALUE;
        int min_x=-2147483648;
        System.out.printf("基本类型int min=Integer.MIN_VALUE的最小值的相反数是:%d\r\n\r\n",-min);
        System.out.printf("基本类型int min=Integer.MIN_VALUE的最小值加一的相反数是:%d\r\n\r\n",-(min+1));
        System.out.printf("int min_x=-2147483648；int min=Integer.MIN_VALUE;中 min==min_x？：%s\r\n\r\n",min==min_x);
        Integer MIN=Integer.MIN_VALUE;
        Integer MIN_X=-2147483648;
        System.out.printf("包装类型 Integer MIN=Integer.MIN_VALUE;的最小值的反数是%d\r\n\r\n",-MIN);
        System.out.printf("包装类型 Integer MIN=Integer.MIN_VALUE;的最小值加一的反数是%d\r\n\r\n",-(MIN+1));
        System.out.printf("Integer MIN=Integer.MIN_VALUE;Integer MIN_X=-2147483648;MIN==MIN_X？：%s\r\n\r\n",MIN==MIN_X);
        System.out.printf("Integer MIN=Integer.MIN_VALUE;Integer MIN_X=-2147483648;MIN.equals(MIN_X)？：%s\r\n\r\n",MIN.equals(MIN_X));
    }
}
