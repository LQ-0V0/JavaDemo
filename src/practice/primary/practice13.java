package practice.primary;

//交换数据，数组首位对调

public class practice13 {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8,9,10};
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
