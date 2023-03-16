import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
/*需求：键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根 。
        结果只保留整数部分 ，小数部分将被舍去 。*/


//分析：
//平方根   16的平方根4
//         4的平方根2


// 10
// 1 * 1 = 1 < 10
// 2 * 2 = 4 < 10
// 3 * 3 = 9 < 10
// 4 * 4 = 16 > 10
//推断：10的平方根是在3~4之间。
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        int result = (int) Math.sqrt(num);
        System.out.println(result);
    }
}
