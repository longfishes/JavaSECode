/**
 * 条件（三元）运算符的用法
 * 比较？输出结果1：输出结果2
 */
public class Operator06 {
    public static void main(String[] args) {

        int score=90;
        String type=score<60?"不及格":"及格";
        System.out.println(type);

        if (score<60){
            System.out.println("不及格");
        }else{
            System.out.println("及格");
        }
    }
}
