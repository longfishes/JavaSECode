/**
 * 整型
 */
public class Int {

    public static void main(String[] args){
        int a=100;      //十进制
        int b=015;      //八进制以0开头，idea会提示这是八进制数
        int c=0xff;     //十六进制以0x开头
        int d=0x10;
        int e=0b101000; //二进制以0b开头
        long yearSalary=21000000000L;//整型常量默认int类型，改为long类型

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(yearSalary);

    }
}
