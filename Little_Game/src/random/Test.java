package random;

public class Test {
    public static void main(String[] args) {
        System.out.println(Random.getRandomNum());
        System.out.println(Random.getRandomNum());

        System.out.println(Score.getScore());
        Score.success();
        Score.addScore();
        Score.reset();
        System.out.println(Score.getScore());
    }
}
