package practice.student;

import java.awt.*;
import java.util.zip.Deflater;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student("A001", "li", 18);
        Student stu2 = new Student("A002", "wang", 20);
        Student stu3 = new Student("A003", "zhao", 19);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //再添加学生对象，且学号为唯一判断（判断数组是否存满）
//        Student stu4 = new Student("A004", "zhang", 60);
//
//        boolean flag = contains(arr, stu4.getId());
//        if(flag){
//            System.out.println("当前id重复，请修改");
//        }else{
//            int count = getCount(arr);
//            if(count == arr.length){
//                //已经存满，创建新数组，将老数组元素复制到新数组
//                Student[] newArr = creatNewArr(arr);
//                newArr[count] = stu4;
//                printArr(newArr);   //遍历所有学生信息
//            }else{
//                //没有存满
//                arr[count] = stu4;
//                printArr(arr);  //遍历所有学生信息
//            }
//        }

        //通过id删除学生信息（存在则删除，不存在则提示删除失败）
//        int index = getIndex(arr, "A001");
//        if(index == -1){
//            System.out.println("删除失败，无此id");
//        }else{
//            arr[index] = null;  //删除该元素
//            printArr(arr);
//        }

        //查询数组id为xxx，如果存在，则其年龄+1岁
        int index = getIndex(arr, "A002");
        if (index == -1) {
            System.out.println("无此id");
        }else{
            Student stu = arr[index];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            printArr(arr);
        }


    }

    //判断数组是否存满
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    //判断id是否唯一
    public static boolean contains(Student[] arr, String id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                String sid = stu.getId();
                if (sid.equals(id)){
                    return true;
                }
            }
        }
        return false;
    }

    //创建新数组，复制老数组
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        //把老数组元素复制到新数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //遍历数组
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
            }
        }
    }

    //找到id再数组中的索引
    public static int getIndex(Student[] arr, String id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                String sid = stu.getId();
                if (sid.equals(id)){
                    return i;
                }
            }
        }
        //循环结束后依旧没有找到，说明不存在
        return -1;
    }

}
