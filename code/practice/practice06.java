package practice;

//折几次纸厚度能达到8844.48m（纸张厚度0.1mm）

public class practice06 {
    public static void main(String[] args) {
        int paper = 1;
        int count = 0;
        while(paper <= 88444800){
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
