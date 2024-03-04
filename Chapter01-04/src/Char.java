/**
 * char是字符型的数据类型，占2个字节
 */
public class Char{

    public static void main(String[] args){
        char c1='a';
        char c2='中';

        String str="爱我中华";  //String表示字符串
        System.out.println(str);

        System.out.println(c1);
        System.out.println(c2);

        char c3='\n';
        System.out.println("a"+c3+"b"+c3+"c");
        System.out.println("\\a"+c3+"\"b\""+c3+"c");
        System.out.println("a\tb\tc\td\te");
    }
}
