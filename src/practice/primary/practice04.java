package practice.primary;

import java.util.Scanner;
//键盘录入两个整数，如果有一个为6或相加为6的倍数，则输出true，否则为false
public class practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0);
    }
}
