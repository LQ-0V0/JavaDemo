package practice.primary;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入猜测的五位数彩票号码：");
        while(true) {
            int guessingNumber = sc.nextInt();
            int length = String.valueOf(guessingNumber).length();
            if (length != 5) {
                System.out.println("数据错误，请重新输入");
                break;
            } else {
                int lottoNumber = lotto();
                int[] num1 = number(guessingNumber);
                int[] num2 = number(lottoNumber);
                int count = 0;
                for (int i = 0; i < 5; i++) {
                    if (num1[i] == num2[i]) {
                        count++;
                    }
                }

                System.out.println("恭喜你一共中了" + count + "个数字");
                switch (count) {
                    case 1, 2, 3, 4, 5 -> System.out.println("共获得" + (int)count(count) + "奖金");
                    default -> System.out.println("未获得奖金");
                }
                break;
            }
        }
    }
    public static int lotto(){
        Random rand = new Random();
        int lotteryNumber = 10000 + rand.nextInt(90000);
        System.out.println("当前彩票号码为：" + lotteryNumber);
        return lotteryNumber;
    }
    public static int[] number(int num){
        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            number[i] = num % 10;
            num /= 10;
        }
        return number;
    }
    public static int count(int num){
        int i = 0;
        int count = 1;
        while(i <= num){
            count *= 10;
            i++;
        }
        return count;
    }
}
