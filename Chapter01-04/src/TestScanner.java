/**
 * 程序的键盘交互
 */
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入用户名");
        String uname = s.nextLine();
        System.out.println("你的用户名是"+uname);

        System.out.println("请输入你的年龄");
        int age = s.nextInt();
        System.out.println("你的年龄是"+age);

        System.out.println("请输入你的月薪");
        double yearSalary = s.nextDouble();
        System.out.println("你的月薪是"+yearSalary);
    }
}
