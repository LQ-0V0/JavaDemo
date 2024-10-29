package primary;

public class DataType {
    //class 创建/定义一个类，类是Java最基本的组成单元；data_type 类名
    public static void main(String[] args) {
        System.out.println(666);        //println输出自动换行，print输出不会自动换行
        System.out.println(-66.6);
        System.out.println("HelloWorld");
        System.out.println('a');
        System.out.println(true);
        System.out.println(false);
        System.out.println("null");
        long long01 = 99999999999L; //long数据类型赋值时，数据值后面需要加上“L”或者“l”
        System.out.println(long01);
        float float01 = 9.999999F;
        System.out.println(float01);    //float数据类型赋值时，数据值后面需要加上“F”或者“f”

    /*
    字面量：告诉程序员，数据在程序中的书写格式
    基本数据类型：
    整数类型:byte(-128~127)、short、int(-21亿~21亿)、long(19位数)
    小数类型:float、double
    字符串类型（双引号）:string
    字符类型（单引号，内容只有一个）:char
    布尔类型（只有两个值：true、false）:boolean
    空类型（空置，值为null）null不能直接打印，需要以字符串的形式打印
     */
    }
}
