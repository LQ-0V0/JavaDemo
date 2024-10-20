package practice;

public class practice05 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println((i + 1) + ":HelloWorld");
//        }

        System.out.println("1-5:");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n5-1:");
        for (int i =5; i> 0; i--){
            System.out.print(i + " ");
        }

        int sum1 = 0;
        System.out.println("\n1+...+100:");
        for (int i = 1; i < 101; i++){
            sum1 += i;
//            System.out.print((sum += i) + " ");
        }
        System.out.println(sum1);

        int sum2 = 0;
        System.out.println("2+4+...+100:");
        for (int i = 2; i < 101; i++){
            if (i % 2 == 0) sum2 += i;
        }
        System.out.println(sum2);

        int number = 0;
        System.out.println("n % 3 == 0 && n % 5 == 0:");
        for (int i = 1; i < 101; i++){
            if (i % 3 == 0 && i % 5 == 0) number++;
        }
        System.out.println(number);
    }
}
