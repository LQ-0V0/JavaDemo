package primary;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        playGame(); //直接调用
//        getSum(num1 , num2);
        sc.close(); // 调用close方法关闭Scanner

        double sum = getSum(1.1,25.4,23.1);
        System.out.println(sum);    //赋值调用
        System.out.println(getSum(11.1,22.2,33.3)); //输出调用

    }

    public static void playGame(){
        System.out.print(1);
        System.out.print(2);
        System.out.print(3);
        System.out.print(4);
    }

    public static void getSum(int num1 , int num2){
        int sum = num1 + num2;
        System.out.println("\n" + sum);
    }

    public static double getSum(double a , double b , double c){
        double sum = a + b + c;
        return sum;
    }

     /*
    方法：
        1、格式-定义【 public static void 方法名() { 方法体; } 】
           格式-调用【 方法名(); 】
           格式-返回值【 public static 返回值类型 方法名(){ 方法体; return 返回值; } 】
           （return下面不能写代码，return必须写在方法里面）
        2、程序中最小的执行单元
        3、方法可以提高啊代码的复用性、可维护性
        4、形式参数和实际参数：
            方法定义时，参数为形参；方法调用时，参数为实参
            函数调用时形参和实参需要一一对应
        5、方法不能嵌套
        6、方法的编写顺序与执行顺序无关，哪个方法先调用，哪个先执行

    方法重载：
        1、同一个类，方法名相同，参数不同（数据类型，数量，顺序），与返回值无关
     */
}
