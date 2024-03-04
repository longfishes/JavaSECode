/**
 * 嵌套循环
 */
public class TestLoop02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a<30){
            System.out.print(b+"\t");
            a++;
            while (a%6==0){
                System.out.println();
                b++;
                a++;
            }
        }

        int i1 = 0;
        for (int i=0;i<5;i++){
            System.out.println();
            i1++;
            for (int m=0;m<5;m++){
                System.out.print(i1+"\t");
            }
        }

        System.out.println();
        System.out.println();

        for (int q=0;q<25;q++) {
            if (q%5==0)System.out.println();
            if (q % 2 == 0) {
                System.out.print("*" + "\t");
            }else {
                System.out.print("#"+"\t");}
        }
    }
}
