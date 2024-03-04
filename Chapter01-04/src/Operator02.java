/**
 * 测试拓展运算符的用法
 * 拓展赋值运算符包括+=，-=，/=，*=
 * a+=b等效于a=a+b
 */
public class Operator02 {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        a+=b;
        System.out.println(a);

        a=3;
        a*=b+3;  //a=a*(b+3)
        System.out.println(a);
    }
}
