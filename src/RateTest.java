import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RateTest {
    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        while (list.size() < 100) {
            if (Math.random() * 2 > 1) count++;
            else {
                list.add(count);
                count = 0;
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println();

        List<Integer> list2 = new ArrayList<>();
        int count2 = 0;

        while (list2.size() < 100) {
            if (Math.random() * 2 < 1) count2++;
            else {
                list2.add(count2);
                count2 = 0;
            }
        }
        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println(list2);

    }

    @Test
    public void test2() {
        System.out.println(Math.pow(2, 10));
    }
}
