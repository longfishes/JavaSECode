/**
 *算术运算符的测试
 * %是取模运算，即取余数
 */
public class Operator01 {

    public static void main(String[] args){
        int a=3;
        int b=4;
        int c=a+b;
        System.out.println(c);

        double d=3+3.14;        //结果类型变为double而不是int
        System.out.println(d);  //float和double的运算都存在误差，不要用来对比

        int d2=32/3;    //32和3都是整型，除法不四舍五入，直接去掉小数部分
        System.out.println(d2);

        double d3=32d/3;  //把32和3改为double类型，可以显示小数，然后再进行四舍五入操作
        System.out.println(d3);

        double d4=32.0/3;  //32.0默认double类型
        System.out.println(d4);

        int a1=10%3;
        int a2=-10%3;
        int a3=10%-3;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        //自增与自减
        int b1=30;
        b1++;  //b1=b1+1
        b1++;
        b1--;  //b1=b1-1
        System.out.println(b1);

        int c1=10;
        System.out.println("c1是"+c1);
        int c2=c1++;                        //c1的值先赋给c2，然后c1再自增
        System.out.println("c2是"+c2);
        int c3=++c1;                        //c1先自增，再赋值给c3
        System.out.println("c3是"+c3);
        System.out.println("现在c1是"+c1);
    }
}
