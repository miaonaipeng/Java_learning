package homework;

//判断和循环
public class day04 {
    public static void main(String[] args) {
//     test6   已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
/*        int x = 2019;
        for (int i = 1949; i <= 2019; i++) {
            if ((2019 -i)%12==0) {
                System.out.println(i);
            }
        }*/

/*test 7 中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。
（年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。
请打印出1988年到2019年的所有闰年年份。
        */
        for (int i = 1988; i <= 2019; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i);
            }
        }
    }
}
