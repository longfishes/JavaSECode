public class ArrayExer07 {
    public static void main(String[] args) {
//数组的赋值
        int[] arr1 = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        int[] arr2 = arr1;                              //赋值arr1给arr2
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) arr2[i] = i;
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");             //地址相同，所以改arr2的元素arr1也会跟着变
        }
        System.out.println();
//数组的复制
        System.out.println();
        int[] arr0 = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] arr3 = new int[arr0.length];
        for (int i = 0; i < arr0.length; i++) {
            arr3[i] = arr0[i];
            if (i % 2 == 0) arr3[i] = i;
        }
        for (int i = 0; i < arr0.length; i++) {
            System.out.print(arr0[i] + "\t");            //地址不相同，所以改arr3的元素arr1不会跟着变
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
