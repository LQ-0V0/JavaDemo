package practice.primary;

//复制数组，copyOfRange(int[] arr , int from , int to)

public class practice16 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copArr = copyOfRange(arr , 1 , 3);
        for (int i = 0; i < copArr.length; i++) {
            System.out.print(copArr[i] + " ");
        }
    }
    public static  int[] copyOfRange(int[] arr , int from , int to){
        int[] copyArr = new int[to - from + 1];
        int index = 0;
        for (int i = from; i < to + 1; i++) {
            copyArr[index] = arr[i];
            index++;
        }
        return copyArr;
    }
}
