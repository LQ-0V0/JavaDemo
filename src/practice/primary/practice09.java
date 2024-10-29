package practice.primary;

//键盘录入大于2的整数x，计算并返回x的平方根（只保留整数部分）

import java.util.Scanner;

public class practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc .nextInt();
        int k = 1;
        for (int i = 1 ; i * i < x; i++){
            k++;
        }
        System.out.println(k - 1);
    }
}
