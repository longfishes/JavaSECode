/**
 * 九九乘法表
 */
public class TestLoop03 {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
           for (int n=1;n<=i;n++) {
               System.out.print(n+"*"+i+"="+(n*i)+"\t");
           }
           System.out.println();
       }
    }
}
