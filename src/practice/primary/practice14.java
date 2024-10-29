package practice.primary;

//打乱数组数据

import java.util.Random;

public class practice14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int random = rand.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
