import java.util.Arrays;

public class ArrayExer09 {
    public static void main(String[] args) {
//扩容
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;

        arr = newArr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
//缩容1(去4不新建数组)
        int[] arr02 = {1, 2, 3, 4, 5, 6, 7};
        int deleteIndex = 0;
        for (int i = 0; i < arr02.length; i++) {
            if (arr02[i] == 4) deleteIndex = i;
        }
        for (int i = deleteIndex; i < arr02.length - 1; i++) {
            arr02[i] = arr02[i + 1];
        }
        arr02[arr02.length - 1] = 0;
        for (int i = 0; i < arr02.length; i++) {
            System.out.print(arr02[i] + "\t");
        }
        System.out.println();
//缩容2(去4新建数组)
        arr02[6] = 4;
        Arrays.sort(arr02);
        int fourNum = 0;
        for (int i = 0; i < arr02.length; i++) {
            if (arr02[i] == 4) {
                fourNum++;
            }
        }
        int[] newArr02 = new int[arr02.length - fourNum];
        int j = 0;
        for (int i = 0; i < arr02.length; i++) {
            if (!(arr02[i] == 4)) {
                newArr02[j] = arr02[i];
                j++;
            }
        }
        arr02 = newArr02;
        for (int i = 0; i < arr02.length; i++) {
            System.out.print(arr02[i] + "\t");
        }
    }
}
