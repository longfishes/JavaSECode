public class TestHomework {
    public static void main(String[] args) {

        int a = 1;
        int sum1 = 0;
        while (a<101){
            sum1 = sum1 + a;
            a += 2;
        }
        System.out.println(sum1);

        int b = 2;
        int sum2 = 0;
        while (b<101){
            sum2 = sum2 + b;
            b += 2;
        }
        System.out.println(sum2);
//加计数器法
        int count = 0;
        int i = 0;
        while(count<131){
            System.out.print(count+"\t");
            count++;
            i++;
            if (i==5) {
                System.out.println();
                i=0;
            }
        }
        System.out.println();
//不加计数器法
        int count0 = 0;
        while(count0<131){
            System.out.print(count0+"\t");
            count0++;
            if ((count0)%5==0) System.out.println();
        }
        System.out.println();
    }
}
