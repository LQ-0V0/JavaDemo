package practice.senior.User;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User rigthUser = new User("zhangsan", "123456");
//        String rightUsername = "zhangsan";
//        String rightPassword = "123456";
        int i = 0;
        while (i <= 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            User user = new User(username, password);
            boolean flag = compare(user.getUsername(), rigthUser.getUsername());
            boolean flag2 = compare(user.getPassword(), rigthUser.getPassword());
            if (flag && flag2) {
                System.out.println("登陆成功");
                break;
            } else if(i < 3){
                System.out.println("用户名或密码错误，你还有" + (3 - i) + "次机会，请重新输入：");
                i++;
            }else{
                System.out.println("3次机会已经用完，用户已锁定");
            }

        }


    }

    public static boolean compare(String str, String rightStr){
        if(str.equals(rightStr)){
            return true;
        }else{
            return false;
        }
    }
}
