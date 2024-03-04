import java.util.Scanner;
public class TestFine02 {

    public static int Fine(int a,int b){
        int w = 0;
        if (a<=10){
            System.out.println("小心点");
        }else if (a<=20){
            w = 100;
        }else if (a<=30){
            w = 200;
        }else if (a<=60){
            System.out.println("半天白干了啊");
            w = b/60;
        }else{
            System.out.println("算旷工啊");
            w = b/10;
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("迟到时间几分钟");
        int a = s.nextInt();
        System.out.println("月薪多少");
        int b = s.nextInt();
        int money = Fine(a,b);
        System.out.println("罚款"+money);
    }
}

