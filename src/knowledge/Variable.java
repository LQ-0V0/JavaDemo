package knowledge;

public class Variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("a:" + a);
        System.out.println("c:" + c);
        a = 40;     //修改变量a的值，变量只能存在一个值
        System.out.println("new a:" + a);
        int d = 1, e = 2, f = 3;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    /*
    格式：【数据类型 变量名 = 数据值】（变量名不允许重复，变量使用前需要赋值）
    标识符命名规则：
    1、硬性要求：由数字、字母、下划线（_）、美元符（$）组成；不能以数字开头；不能是关键字；区分大小写。
    2、软性建议：小驼峰命名法：方法、变量（标识符是一个单词，全部小写；由多单词组成，词首小写，其余单词首字母大写）
                （例：name、firstName）
                大驼峰命名法：类名（标识符是一个单词，首字母大写；由多单词组成，每个单词首字母大写）
                （例：Student、GoodStudent）
     */
    }
}
