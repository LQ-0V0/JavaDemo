package practice.primary;

//1、统计有一个3的倍数
//2、奇数扩大二倍，偶数变为二分之一
public class practice11 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 ==0){
                System.out.print(arr[i] + " ");
                j++;
        }
        }
        System.out.println("\n共有" + j + "个");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else{
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
