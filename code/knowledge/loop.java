package knowledge;

public class loop {
    public static void main(String[] args) {
//        for(;;){
//            System.out.println("study");
//        }
//        while(true){
//            System.out.println("study");
//        }
        //无限循环下面的代码永远执行不了
//        System.out.println("1");
//        for(int i = 1 ; i <= 5; i++){
//            if(i == 3){
//                continue;       //结束本次循环，执行下次循环
//            }
//            System.out.println(i);
//        }
        for (int i = 1 ; i <= 5 ; i++){
            System.out.println(i);
            if(i == 3){
                break;          //结束整个循环
            }

        }
    /*
    循环（高级）：
        1、无限循环：1、for(;;){} ；2、while(true){}（常用） ；3、do{}while(true);
        2、跳转控制语句：continue（结束本次循环，执行下次循环）、break（结束整个循环）
     */
    }
}
