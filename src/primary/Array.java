package primary;

public class Array {
    public static void main(String[] args) {
        int id[] = new int[]{1,2,3};
        int age[] = {11,12,13};
        String[] name = {"zhangsan" , "lisi" , "wangwu"};
        double height[] = {180.1,180.2,120.3};
//        System.out.println(id);
        //输出数组的地址值：[I@10f87f48
        //[：表示当前是数组
        //I：表示数组里面的元素都是int类型的
        //@：间隔符号（固定格式）
        //10f87f48：数组真正的地址（十六进制）
        //习惯叫整体为数组的地址值
//        System.out.println(id[0]);
//        id[0] = 4;
//        System.out.println(id[0]);
//        int[] arr = {1,2,3,4,5,6,4,4,2,3,1};
//        for(int i = 0 ; i< arr.length ; i++) {    //数组名.length ： 获取数组的长度,数组名.fori（代码缩写）
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println('\n');
//        int[] arr2 = new int[50];
//        for(int i = 0 ; i< arr2.length ; i++) {
//            arr2[i] = i;
//            System.out.print(arr2[i] + " ");
//        }

        int[][] arr3= {
                {1,1},
                {2,2},
                {3,3}
        };
        System.out.println(arr3[0]);    //获取第一个一维数组的地址值
        System.out.println(arr3[0][0]);
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
            }
        }
    /*
    数组：
        1、格式：【 数据类型[] 数组名 】或【 数据类型 数组名[] 】，例：int [] array 或 int array []
        2、一种容器，可以存储多种数据类型的多个值（结合隐式转换）
        3、查询数组元素：【 数组名[索引] 】
        4、存储元素至数组：【 数组名 [索引] = 具体数据/变量】（一旦覆盖，原数据将会不存在）

    数组的静态初始化：
        1、格式：【 数据类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3...}; 】
                 简化：【 数据类型[] 数组名 = {}; 】
        2、为数组容器开辟空间，并将数据存入容器

    数组的动态初始化：
        1、格式【 数据类型[] 数组名 = new 数据类型[数组长度]; 】
        2、整数默认初始化：0； 浮点数：0.0； 字符：'/u0000'（空格）；布尔：false； 引用：null（除了八种数据类型都是引用数据类型）

    二维数组：
        1、静态初始化【 数据类型[][] 数组名 = new 数据类型[][] { {元素1,元素2},{元素1,元素2} };  】
        2、动态初始化【 数据类型[][] 数组名 = new 数据类型[m][n]; 】
     */
    }
}