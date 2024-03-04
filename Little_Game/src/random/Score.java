package random;

public class Score {
    private static int score = 20000;
    private static int total;

    public static int getScore() {
        return score;
    }

    public static void addScore() {
        if (total == 1){
            score += 1000;
        }else if (total == 2){
            score += 3000;
        }else if (total == 3){
            score += 6000;
        }else if (total == 4){
            score += 10000;
        }else if (total == 5){
            score += 20000;
        }else if (total == 6){
            score += 50000;
        }else if (total > 6){
            score += 100000;
        }

    }

    public static void reduceScore(int add) {
        if (total == 1){
            score -= 1000;
        }else if (total == 2){
            score -= 3000;
        }else if (total == 3){
            score -= 6000;
        }else if (total == 4){
            score -= 10000;
        }else if (total == 5){
            score -= 20000;
        }else if (total == 6){
            score -= 50000;
        }else if (total > 6){
            score -= 100000;
        }else{
            score -= 5000;
        }
    }

    public static void reset(){
        total = 0;
    }

    public static void success(){
        total++;
    }
}
