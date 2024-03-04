//Sunday,Monday,Tuesday,Tuesday,Thursday,Friday,Saturday
//0      1      2       3       4        5      6
import java.util.Scanner;
public class ArrayExer01 {
    public static void main(String[] args) {
        String[] strings = new String[]{"Sunday","Monday","Tuesday","Tuesday","Thursday","Friday","Saturday"};
        Scanner s=new Scanner(System.in);
        System.out.println("输入数字输出星期一到星期天");
        System.out.println("输入66退出程序");
        while(true){
            int n = s.nextInt();
            if (n > -1 & n < 7) {
                System.out.println(strings[n]);
            } else if (n==66){
                System.out.println("exit");
                break;
            } else {
                System.out.println("你输入的数据有误，请重新输入");
            }
        }

    }
}
