import java.util.Scanner;

/*需求：

 给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围） 。

 将两数相除，要求不使用乘法、除法和 % 运算符。

 得到商和余数。*/
public class test2 {
    //求商和余数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = 0, remainder;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        remainder = dividend;
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);
    }
}
