package solution;

import org.junit.Test;

public class Solution4 {
    public int method(int stars){
        int ans = 0;
        if (stars==1)return 1;
        if (stars%2==0) {
            ans++;
            ans++;

            int n1 = 2;
            int n2 = stars/2+1;
            for (int i = 0; i < stars / 2 - 1; i++) {
                ans += n1*n2;
                n1 += 2;
                n2--;
            }

        }else {
            ans++;
            ans++;

            int n1 = 1;
            int n2 = stars/2+1;
            for (int i = 0; i < stars / 2; i++) {
                ans += n1*n2;
                n1+=2;
                n2--;
            }
        }


        return ans;
    }


    @Test
    public void test(){
        System.out.println(method(3));
    }
}
