package practice.goods;

public class GoodsText {
    public static void main(String[] args) {
        //创建一个数组
        Goods[] arr =new Goods[3];

        //创建三个商品对象
        Goods g1 = new Goods("001", "橘子", 5.8, 1000);
        Goods g2 = new Goods("002", "菠萝", 6.2, 3000);
        Goods g3 = new Goods("003", "苹果", 1.4, 5000);

        //把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //求价格price的平均值
//        double sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i].getPrice();
//        }
//        System.out.printf("%.2f", sum / arr.length);

        //遍历，并打印
//        for (int i = 0; i < arr.length; i++) {
//            Goods goods = arr[i];
//            System.out.println(goods.getId()+ " "+ goods.getName()+ " " + goods.getPrice()+ " " + goods.getCount());
//        }


    }
}
