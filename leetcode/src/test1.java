import java.util.Scanner;

//回文数
//需求：给你一个整数 x 。
//
// 如果 x 是一个回文整数，打印 true ，否则，返回 false 。
//
//解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
//例如，121 是回文，而 123 不是。
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int start = x;
        int num = 0;
        // 不断取x个位上的值，一直到x等于0
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num == start);


    }
}
