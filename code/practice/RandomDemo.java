package practice;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);    //生成一个随机数，括号里是随机数的范围,从0开始，从n-1结束，例：0~99
        System.out.println(number);
    }
}
