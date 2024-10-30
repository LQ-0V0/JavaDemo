package knowledge;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
//        String str1 = "abc";
//        String str2 = new String();     //空参构造，创建一个空白字符串
//        String str3 = "ABC";
//        int num = 123;
        Scanner sc =new Scanner(System.in);

//        System.out.println("请输入字符串：");
//        String str4 = sc.next();
//        System.out.println(num + str1);
//        System.out.println("@" + str2 + "!");

        //比较
//        System.out.println(str1 == str3);   //比较字符串的地址
//        System.out.println(str1.equals(str3));  //比较字符串是否相同
//        System.out.println(str1.equalsIgnoreCase(str3));    //忽略大小写的比较

        //遍历
//        System.out.println(str1.length());

//        for (int i = 0; i < str4.length(); i++){
//            char c = str4.charAt(i);
//            System.out.print(c + " ");

        //统计 -> 统计字符串中大写字母，小写字符，数字字符出现的次数

//        int bigCount = 0;
//        int smallCount = 0;
//        int numberCount = 0;
//        for (int i = 0; i < str4.length(); i++) {
//            char c = str4.charAt(i);
//            if(c >= 'a' && c <= 'z'){
//                smallCount++;
//            }else if(c >= 'A' && c <= 'Z'){
//                bigCount++;
//            }else if(c >= '0' && c <= '9'){
//                numberCount++;
//            }
//        }
//        System.out.printf("小写字母有：%d个\n大写字母有：%d个\n数字字符有：%d个", smallCount, bigCount, numberCount);

        //字符串的拼接（定义一个方法）-> 将数组拼接成字符串
//        int[] arr = {1,2,3,4,5};
//        String str5 = arrTOString(arr);
//        System.out.println(str5);

        //反转字符
//        String str6 = "abcdefg";
//        String reverseStr = reverse(str6);
//        System.out.println(reverseStr);

        //金额转换
        int money;
        while (true) {
            System.out.println("请输入一个金额：");
             money = sc.nextInt();
            if(money >= 0 && money <= 9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }

        String capitalMoney = "";
        while(true){
            int num = money % 10;
            String capitalNumber = getCapitalNumber(num);
            capitalMoney = capitalNumber + capitalMoney;
            money /= 10;

            if (money == 0){
                break;
            }
        }

        int count = 7 - capitalMoney.length();
        for (int i = 0; i < count; i++) {
            capitalMoney = "零" + capitalMoney;
        }

        String[] arr ={"佰", "拾", "万", "仟", "佰", "什", "元"};
        
        String resultMoney = "";
        for (int i =0; i < capitalMoney.length(); i++){
            resultMoney += capitalMoney.charAt(i) + arr[i];
        }
        System.out.println(resultMoney);
    }
    //拼接字符串
    public static String arrTOString(int[] arr) {
        String str = "[";
        for (int i = 0; i <= arr.length- 2; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1] + "]";
        return str;
    }

    //反转字符串
    public static String reverse(String str) {
        String result ="";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //金额转换-数字转换成大写中文
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }

    /*
    1、字符串：
        1、字符串参加 “+”的操作，都是进行拼接；例：123 + "abc" 得到 "123abc"
        2、字符串常用API：String、StringBuilder、StringJonier、StringBuffer、Pattern、Matcher

    2、String概述：【 java.long.String 】
        1、Java程序中的所有字符串文字都被视为这个类的对象
        2、字符串内容是无法改变的；字符拼接，将产生新的字符串
        3、“ == ”比较的是字符串地址
        4、equals 比较字符串，完全一样是true； equalslgnoreCase 忽略大小写的比较

    3、遍历字符串：
        1、public char charAt(int index)   根据索引返回字符：合适【 字符串对象.charAT() 】
        2、public int length()   返回字符串长度：格式【 字符串对象.length() 】

     */

}
