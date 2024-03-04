import java.util.Scanner;
public class TestReview {

    public static void main(String[] args) {
        //复习一下九九乘法表的嵌套循环
        for (int n=1;n<=9;n++){
            for (int i=1;i<=n;i++){
                System.out.print(i+"*"+n+"="+i*n+"\t");
            }
            System.out.println();
        }
        //复习一下Scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你喜欢的数字");
        int n= scanner.nextInt();
        System.out.println("你是"+n);



    }
}
