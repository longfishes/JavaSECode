/**
 * 测试类型的自动转化
 */
public class AutoConvert {
    public static void main(String[] args) {
        int a=2345;
        long b=a;
        //int c=b;  int可以自动转化long，但long不能自动转化int
        //整型常量是int类型可以自动转换为byte，short类型，但不能超过表述范围
        byte c=123;

    }
}
