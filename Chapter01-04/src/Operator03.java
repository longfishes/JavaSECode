/**
 * 测试关系运算符的用法
 */
public class Operator03 {

    public static void main(String[] args) {
        int a=3;
        int b=4;
        boolean c=a>b;
        System.out.println(c);

        char d='h';  //char类型是字符集，也可以比较Unicode字符集中的编码
        //char值位于0~65536之间
        System.out.println((int)d);  //将d的数据类型强制改为int，以看到h的Unicode代码
        boolean e=d>100; //默认boolean e=(int)d>100;
        System.out.println(e);
    }
}
