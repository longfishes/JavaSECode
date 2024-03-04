//年龄计算器2023
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入你的生日");
        int year= s.nextInt();
        System.out.println("你的年龄是"+(2022-year));
    }
}