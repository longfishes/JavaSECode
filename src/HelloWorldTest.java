public class HelloWorldTest {
    public static void main(String[] args) {
        HelloWorldTest clear = new HelloWorldTest();
        char[][] chars = new char[5][5];


        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);

        }
        clear.cls();
    }

    public void cls(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
