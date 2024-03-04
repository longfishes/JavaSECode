package solution;

import org.junit.Test;

public class Solution3 {
    public int findFirstIndex(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            boolean isFlag = true;
            for (int j = 0; j < needle.length(); j++) {
                if (!(haystack.charAt(i+j) == needle.charAt(j))) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) return i;
        }
        return -1;
    }


    @Test
    public void test() {
        System.out.println(findFirstIndex("codeleetcode", "code"));
    }
}
