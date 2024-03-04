/**
 * 测试while,for,do-while循环的用法
 */
public class TestLoop {
    public static void main(String[] args) {
//连续打印X次的while版本
        int a = 0;
        while (a<3){
            System.out.println("sb");
            a++;
        }
//连续打印X次的for版本
        for (int a1 = 0;a1 < 3;a1++){
            System.out.println("sb1");
        }
//累加1-100的while版本
        int b = 1;
        int sum = 0;
        while (b<101){
            sum = sum + b;
            b++;
        }
        System.out.println(sum);
//累加1-100的for版本
        int sum1 = 0;
        for (int b1 = 1;b1<101;b1++){
            sum1 = sum1 + b1;
        }
        System.out.println(sum1);
//输出9-1
        for (int m = 9;m>0;m--){
            System.out.print(m+"\t");  //用print不带ln表示打印完之后不换行
        }
//输出1-90能被3整除的数（没if）
        System.out.println();
        for (int n = 3;n<91;n += 3){
            System.out.print(n+"\t");
        }
        System.out.println();
//输出90-1能被3整除的数（有if）
        for (int n1 = 90;n1>0;n1--){
            if (n1%3==0)System.out.print(n1+"\t");
        }
        System.out.println();
    }
}
