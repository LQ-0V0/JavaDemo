package practice.game;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("chen",100,'男');
        Role r2 = new Role("zheng",100,'女');

        r1.showRoleInfo();
        r2.showRoleInfo();

//        while(true){
//            r1.attack(r2);
//            if(r2.getBlood() == 0){
//                System.out.println(r1.getName() + "斩杀了" + r2.getName() +"\n游戏结束");
//                break;
//            }
//
//            r2.attack(r1);
//            if(r1.getBlood() == 0){
//                System.out.println(r2.getName() + "斩杀了" + r1.getName() +"\n游戏结束");
//                break;
//            }
//
//        }

    }
}
