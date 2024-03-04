/**
 * 方法的重载
 */
public class TestOverload {
    public static int add(int a){
        int b = 1;
        return a+b;
    }
    public static int add(int a,int k){
        int b = (int)(Math.random()*5);
        return a+b+k;
    }
    public static void add(){
        int c = 1+2+3;
        System.out.println(c);
        System.out.println(114514);
    }

    public static void main(String[] args) {
        System.out.println(add(1));
        System.out.println(add(2,3));
        add();
        System.out.println();
    }

}
