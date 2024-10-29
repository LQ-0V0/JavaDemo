package practice.primary;

//将数字：个、十、百位数字分开输出

public class practice03 {
    public static void main(String[] args){
        int a = 123;
        int b = a % 10;
        int c = a /10 % 10;
        int d = a / 100 % 10;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
