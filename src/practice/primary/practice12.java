package practice.primary;

//输出数组最大值
//输出总和，平均值
//统计多少数字小于平均值

public class practice12 {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8,9};
        int max = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max:" + max);

        int sum = arr[0];
        double mean = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        mean = (double)sum / arr.length;
        System.out.println("sum:" + sum);
        System.out.println("mean:" + mean);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < mean){
                count++;
            }
        }
        System.out.println("count:" + count);
    }
}
