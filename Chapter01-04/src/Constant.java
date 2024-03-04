/**
 * 常量
 */
public class Constant{

    public static void main(String[] args){
        final double PI=3.14;  //PI=3.1415;无法为常量再赋值
        final int MAX_SPEED=120;
        int r=6;
        double area=PI*r*r;
        double circle=PI*r*2;
        System.out.println("面积"+area);
        System.out.println("周长"+circle);
    }

}