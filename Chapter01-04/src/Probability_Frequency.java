public class Probability_Frequency {

    public static void main(String[] args) {

        long a1 = System.currentTimeMillis();

        int n = 0;
        for (int i=0;i<100000;i++){
            int a = (int)(Math.random()*6+1);
            n += a;
        }
        System.out.println(n);

        long b = System.currentTimeMillis();

        System.out.println(b-a1);
    }
}
