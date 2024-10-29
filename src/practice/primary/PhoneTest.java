package practice.primary;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone phone = new Phone();
        //给手机赋值
        phone.setBrand("xiaomi");
        phone.setPrice(1999.99);
//        phone.p = 1;
        //获取手机对象中的值
        System.out.println(phone.getBrand());
        System.out.println(phone.getPrice());
        //调用手机中的方法
        phone.call();
        phone.playGame();

        Phone phone2 = new Phone();
        phone2.setBrand("iphone");
        phone2.setPrice(19999.99);

        System.out.println(phone2.getBrand());
        System.out.println(phone2.getPrice());

        phone2.call();
        phone2.playGame();
    }
}
