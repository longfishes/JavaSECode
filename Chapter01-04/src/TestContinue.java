/**
 * 测试continue语句的用法
 * 将100-150中不能被3整除的数输出
 */
public class TestContinue {
    public static void main(String[] args) {
        int count = 0;
        for (int i=100;i<151;i++){
            if (count==5){
                System.out.println();
                count = 0;
            }
            if (i%3==0)continue;
            count++;
            System.out.print(i+"\t");
        }
    }
}
