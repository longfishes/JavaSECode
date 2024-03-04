/**
 * 年薪计算器1.0
 */
import java.util.Scanner;
public class YearSalaryCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("------年薪计算器------");
            System.out.println("-----66重置88退出-----");
            System.out.println("请输入月薪");
            int m = s.nextInt();
            if (m == 88) {
                System.out.println("再见");
                break;
            }else if (m==66){
                System.out.println("重新开始计算");
                continue;
            }
            System.out.println("您今年为多少薪");
            int c = s.nextInt();
            if (c == 88) {
                System.out.println("再见");
                break;
            }else if (c==66){
                System.out.println("重新开始计算");
                continue;
            }
            int YearSalary = m * c;
            System.out.println("你的年薪为"+YearSalary);
            if (YearSalary>=200000){
                System.out.println("恭喜你超越98%的国人");
            }else if (YearSalary>=100000){
                System.out.println("恭喜你超越90%的国人");
            }
        }


    }
}
