/**
 * 测试位运算符的用法
 * true1 false0
 */
public class Operator05 {
    public static void main(String[] args) {
        int a=7; //0111
        int b=8; //1000
        System.out.println(a&b);  //0&1,1&0,1&0,1&0
        System.out.println(a|b);  //同理
        System.out.println(a^b);
        System.out.println(~b);

        int c=5<<1;  //5*2
        System.out.println(c);
        System.out.println(40>>3);  //40/8 , 40/(2*2*2)
        /*
         *乘以2除以2最快的方法是移位
         */
    }
}
