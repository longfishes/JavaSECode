import java.util.Scanner;

public class ArrayExer02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int[] scores = new int[s.nextInt()];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生成绩");
            scores[i] = s.nextInt();
        }

        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }

        System.out.println("最高分：" + maxScore);

        int As = 0;
        int Bs = 0;
        int Cs = 0;
        int Ds = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= (maxScore - 10)) {
                System.out.println("student " + (i + 1) + " score is " + scores[i] + " grade is A");
                As++;
            } else if (scores[i] >= (maxScore - 20)) {
                System.out.println("student " + (i + 1) + " score is " + scores[i] + " grade is B");
                Bs++;
            } else if (scores[i] >= (maxScore - 30)) {
                System.out.println("student " + (i + 1) + " score is " + scores[i] + " grade is C");
                Cs++;
            } else {
                System.out.println("student " + (i + 1) + " score is " + scores[i] + " grade is D");
                Ds++;
            }
        }

        System.out.println("A的人数为" + As);
        System.out.println("B的人数为" + Bs);
        System.out.println("C的人数为" + Cs);
        System.out.println("D的人数为" + Ds);
    }
}
