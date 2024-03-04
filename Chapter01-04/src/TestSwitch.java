/**
 * 测试switch语句的用法
 */
public class TestSwitch {

    public static void main(String[] args) {
        int grade = (int)(Math.random()*4+1);
        System.out.println(grade);

        switch (grade){
            case 1:
                System.out.println("大一");
                break;
            case 2:
                System.out.println("大二");
                break;
            case 3:
                System.out.println("大三");
                break;
            default:
                System.out.println("大四");
        }

    }
}
