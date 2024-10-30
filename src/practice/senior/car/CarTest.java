package practice.senior.car;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[3];

        int i = 1;
        while (i <= 3){
            System.out.println("请输入商品" + i + "的name、price、color（中间用空格隔开）：");
            String n = sc.next();
            double p = sc.nextDouble();
            String c = sc.next();

            arr[i-1] = new Car(n,p,c);
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j].getName() + " " + arr[j].getPrice() + " " + arr[j].getColor());
        }

    }
}
