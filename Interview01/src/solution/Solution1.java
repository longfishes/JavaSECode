package solution;

import org.junit.Test;

import java.util.Arrays;

public class Solution1 {
    public void method(int x,int a,int y,int b,String str){
        String[] strX = new String[a];
        String[] strY = new String[b];
        int index = 0;
        for (int i = 0; i < a; i++) {
            strX[i] = str.substring(index,index + x);
            index += x;
        }
//        System.out.println(Arrays.toString(strX));
        for (int i = 0; i < b; i++) {
            strY[i] = str.substring(index,index + y);
            index += y;
        }
//        System.out.println(Arrays.toString(strY));

        for (int i = 0; i < a; i++) {
            System.out.print((char)Integer.parseInt(strX[i]));
        }

        System.out.println();

        for (int i = 0; i < b; i++) {
            System.out.print((char)Integer.parseInt(strY[i]));
        }
    }


    @Test
    public void test(){
        method(5,4,2,8,"251053520121152208376780808469657733");
    }

    @Test
    public void test2(){
        char c = '我';
        char c2 = '要';
        char c3 = '加';
        char c4 = '入';
        System.out.println((int)c);
        System.out.println((int)c2);
        System.out.println((int)c3);
        System.out.println((int)c4);
    }
}
