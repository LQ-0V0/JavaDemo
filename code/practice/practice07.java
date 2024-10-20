package practice;

import java.util.Scanner;
//x为回文数，则打印true，否则打印false
public class practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int number = sc.nextInt();
        int number2 = number;
        int number3 = 0;
        while (number2 != 0 ){
            int i = number2 % 10;
            number2 /= 10;
            number3 =number3 * 10 + i;
        }
        System.out.println(number3 == number);
    }
}
