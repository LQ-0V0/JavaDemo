package practice.primary;

//比较两个长方形的面积

public class practice15 {
    public static void main(String[] args) {
        double area1 = getArea(11.5 , 5.6);
        double area2 = getArea(9.6 , 8.5);
        System.out.println(area1 > area2 ? "area1: " + area1 : "area2: " + area2);
    }
    public static double getArea(double len , double width){
        double area = len * width;
        return area;
    }
}
