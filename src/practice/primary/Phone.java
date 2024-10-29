package practice.primary;

public class Phone {

    private String brand;
    private double price;

    public Phone() {
        System.out.println("无");
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    //给成员变量赋值
    public void setBrand(String brand) {
        this.brand = brand;
    }
    //对外提供brand属性
    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void call(){
        System.out.println("call");
    }

    public void playGame(){
        System.out.println("playGame");
    }
}

