package knowledge;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //创建对象，表示我现在要用Scanner这个类
        int i = sc.nextInt();
    /*体系1、遇到空格、制表符、回车，会停止录入
        int i = sc.nextInt();   //接收整数
        double d = sc.nextDouble(); //接收小数
        String s = sc.next(); //接收字符串

      体系2、可以接受空格、制表符，遇到回车，才停止录入
        Line l = nextLine();  //接收字符串

    （两种体系不弄混用）
     */


//        System.out.println(i);


//        System.out.println("请输入第一个数字：");
//        int number1 = sc.nextInt();
//        System.out.println("请输入第二个数字：");
//        int number2 = sc.nextInt();
//        System.out.println(number1 + number2);
    }
}
