package random;

public class View {

    public void start(){
        int defaultNum = Random.getRandomNum();
    }

    public static void main(String[] args) {
        View view = new View();
        view.start();
    }
}
