package knowledge;

public class operator {
    public static void main(String[] args) {
        System.out.println(1 % 10);

        int a = 10;
        double b = a;   //隐形转换
        System.out.println(a);
        System.out.println(b);

        double c = 11.2;
        int d = (int) c;    //强制转换
        System.out.println(c);
        System.out.println(d);

        int e = 300;
        byte f = (byte) e;
        System.out.println(e);
        System.out.println(f);  //数据错误

        byte g1 = 10;
        byte g2 = 20;
        byte g3 = (byte) (g1 + g2);
        System.out.println(g3);

        System.out.println("123" + 123);    //当“+”前后数据出现字符串，则将前后数据进行拼接，并产生一个新字符串
        System.out.println(1 + 99 + "123"); //结果100123

        char h = 'a';
        int result = h + 0;
        System.out.println(result); //字符+字符或字符+数字，会把字符通过ASCII码表查询到的数字进行计算（A65、a97）
        System.out.println(h + "abc");  //结果aabc

        int i1 = 10;
        int i2 = 10;
        int j1 = i1++;
        int j2 = ++i2;
        System.out.println(j1);
        System.out.println(j2);

        int k1 = 1;
        k1 += 1;    //k1 = (int)(k1 + 1)
        System.out.println(k1);
    /*
    运算符：
        算数运算符：+ - * / %     数据类型，取值范围：byte、short、int、long、float、double(由小到大）
            1、数据类型不同，无法直接参与运算，必须转成相同类型
            2、隐式转换，取值范围：小变大，再运算；（byte、short、char运算时，转化成int类型，再进行计算）
            3、强制转换，取值范围：大变小，再运算；（格式：目标数据类型 变量名 = (目标数据类型)被强制转换的数据）

        自增自减运算符：++ --（单独使用，结果一样;参与计算：a++   先用后加，++a   先加后用）

        赋值运算符：= += -= /= *= %=（底层隐藏：强制转换）

        关系与算符：== != > >= < <=
            1、等于、不等于、大于、大于等于、小于、小于等于
            2、结果都是boolean类型，成立true、不成立false

        逻辑运算符：& | ^ !
            1、& 逻辑与：两边为都真，才为真
               | 逻辑或：两边为都假，才为假
               ^ 逻辑异或：相同为false，不同为ture
               ! 逻辑非：取反
            2、短路逻辑运算符：&& 前面为真，才会继续判断后面
                             || 前面为假，才会继续判断后
        三元运算符：格式【关系表达式 ? 表达式1 : 表达式2】（关系表达式为真，则执行表达式1，否则执行表达式2）

     */
    }
}
