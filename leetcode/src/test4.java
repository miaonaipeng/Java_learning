import java.util.Scanner;

public class test4 {
    //    键盘录入一个正整数 x ，判断该整数是否为一个质数。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int x = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is not a prime number");
        }

    }
}

