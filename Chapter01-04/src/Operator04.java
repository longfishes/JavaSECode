/**
 *测试逻辑运算符的用法
 */
public class Operator04 {
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=false;

        System.out.println(b1&b2);  //与
        System.out.println(b1|b2);  //非

        System.out.println(!b2);  //取反

        System.out.println(b1^b2);
        System.out.println(b1^b1);   //亦或运算

        boolean b3=(1>2 && (4<1/0));  //短路与，短路或
    }
}
