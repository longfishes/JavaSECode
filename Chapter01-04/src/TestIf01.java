/**
 * 掷骰子游戏
 */
public class TestIf01 {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 2 + 2);  //2到3的随机数
        System.out.println(rand);

        int i = (int) (Math.random() * 6 + 1);  //都是1到6的随机数
        int j = (int) (Math.random() * 6 + 1);
        int k = (int) (Math.random() * 6 + 1);
        int count = i + j + k;

        if (count >= 15) {
            System.out.println("您");
        }
        if (count < 15 && count >= 10) {
            System.out.println(6);
        }
        if (count < 10) {
            System.out.println("乐");
        }

        if (count >= 15) {
            System.out.println("您");
        } else if (count >= 10) {
            System.out.println(6);
        }else {
            System.out.println("乐");
        }
    }
}