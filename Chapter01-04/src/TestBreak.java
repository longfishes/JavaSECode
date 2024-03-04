/*
 * 测试break语句的用法
 * 随机随到X时停止
 */
import java.util.Scanner;
public class TestBreak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入0-100的整数");
        int i = 0;
        int total = 0;
        int n = s.nextInt();
        if (n<0||n>100){
            System.out.println("都说了0-100");
            System.exit(0);
        }
        while(true){
            int a = (int)(Math.random()*101);
            i++;
            total++;
            System.out.print(a+"\t");
            if (a==n) break;
            if (i==5){
                System.out.println();
                i = 0;
            }
        }
        System.out.println();
        System.out.println("你抽了"+total+"次");

    }
}
