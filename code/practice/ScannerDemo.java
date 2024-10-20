package practice;

import java.util.Scanner;   //导包（写到类定义的上面）

public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //创建对象，表示我现在要用Scanner这个类
        System.out.println("请输入整数：");
        int i = sc.nextInt();   //接收数据
        System.out.println(i);
//        System.out.println("请输入第一个数字：");
//        int number1 = sc.nextInt();
//        System.out.println("请输入第二个数字：");
//        int number2 = sc.nextInt();
//        System.out.println(number1 + number2);
    }
}
