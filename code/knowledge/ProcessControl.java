package knowledge;

import java.util.Scanner;

public class ProcessControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 10){
            System.out.println(number);
        }else{
            System.out.println("no");
        }
        boolean bool = false;
        //判断布尔类型，直接将变量名写入关系表达式，不用使用“==”
        if(bool){
            System.out.println(bool);
        }

        switch (number){
            case 1 -> System.out.println("一");  //jdk12的用法，省略break,可以再语句体前后加上“大括号”
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("无");
        }

        int week = sc.nextInt();

        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("数据错误，没有该星期");
        }

        for ( int i = 1; i <= 10; i++){
            System.out.println("HelloWorld");
        }

        int i = 0;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
    /*
    顺序结构：代码先后顺序，自上而下，先后运行
    分支结构：
        if语句：【 if(关系表达式1){
                   语句体1;
                    }else if(关系表达式2) {
                       语句体2;
                   }
                        ...
                    else {
                        语句体n+1;
                   }                        】
        switch：【 switch(表达式){           //表达式取值：byte、short、int、char（jdk5以后有枚举、jdk7以后有String）
                        case 值1:           //case后的值只能是书面量，而且不能够重复
                            语句体1;
                            break;          //遇到break就会结束语句，如果无break，程序会继续执行下一个case
                        case 值2:
                            语句体2;
                            break;
                        ...
                        defaualt           //可以省略，省略后，case中没有所需的值后，直接结束语句
                            语句体n+1;
                            break;      】

    循环结构：（使用习惯：for知道循环次数、范围时使用，while不知道时使用）
        for:【for(初始化语句;条件判断语句;条件控制语句){
                循环体语句;
                }                                       】

        while:【while(条件判断语句){
                    循环体语句;
                    条件控制语句;
                    }                   】

        do ... while:【初始化语句;
        (先执行后判断)  do{
                            循环体语句;
                            条件控制语句;
                          }while;         】
     */
    }
}
