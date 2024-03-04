package random;

public class Random {

    public static int getRandomNum() {
        int a = (int) (Math.random() * 6 + 1);
        int b = (int) (Math.random() * 6 + 1);
        System.out.println("一号骰子:"+a);
        System.out.println("二号骰子:"+b);
        System.out.println("得分:"+(a + b));
        return a + b;
    }
}
