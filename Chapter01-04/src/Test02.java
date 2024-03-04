/*
 * 身份证最后一位（校验位）计算器
 * @author 长鱼
 */
import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入身份证前17位");
        long no=s.nextLong();
        if (no>99999999999999999L){
            System.out.println("你输入的号码有误，请检查是否有重复位");
            System.exit(0);
        }
        if (no<10000000000000000L){
            System.out.println("你输入的号码有误，请检查是否有缺失位");
            System.exit(0);
        }
        long a=no%10;
        long b=no/10%10;
        long c=no/10/10%10;
        long d=no/10/10/10%10;
        long e=no/10/10/10/10%10;
        long f=no/10/10/10/10/10%10;
        long g=no/10/10/10/10/10/10%10;
        long h=no/10/10/10/10/10/10/10%10;
        long i=no/10/10/10/10/10/10/10/10%10;
        long j=no/10/10/10/10/10/10/10/10/10%10;
        long k=no/10/10/10/10/10/10/10/10/10/10%10;
        long l=no/10/10/10/10/10/10/10/10/10/10/10%10;
        long m=no/10/10/10/10/10/10/10/10/10/10/10/10%10;
        long n=no/10/10/10/10/10/10/10/10/10/10/10/10/10%10;
        long o=no/10/10/10/10/10/10/10/10/10/10/10/10/10/10%10;
        long p=no/10/10/10/10/10/10/10/10/10/10/10/10/10/10/10%10;
        long q=no/10/10/10/10/10/10/10/10/10/10/10/10/10/10/10/10%10;
        long total=q*7+p*9+o*10+n*5+m*8+l*4+k*2+j+i*6+h*3+g*7+f*9+e*10+d*5+c*8+b*4+a*2;
        long fin0=total%11;
        long fin=99;
        if (fin0==0){
            fin=1;
        }
        if (fin0==1){
            fin=0;
        }
        if (fin0==2){
            System.out.println("你的身份证最后一位是X");
            System.exit(0);
        }
        if (fin0==3){
            fin=9;
        }
        if (fin0==4){
            fin=8;
        }
        if (fin0==5){
            fin=7;
        }
        if (fin0==6){
            fin=6;
        }
        if (fin0==7){
            fin=5;
        }
        if (fin0==8){
            fin=4;
        }
        if (fin0==9){
            fin=3;
        }
        if (fin0==10){
            fin=2;
        }
        System.out.println("你的身份证最后一位是"+fin);
    }
}
