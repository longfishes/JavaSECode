//数组的反转
public class ArrayExer08 {
    public static void main(String[] args) {
//方法1
        int[] arr = {1,2,3,4,5,6};
            for (int i = 0; i < arr.length / 2 ; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
//方法2
        int[] arr0 = {1,2,3,4,5,6,7};
        int[] arr3 = new int[arr0.length];
        int j = 0;
        for (int i = arr0.length; i > 0; i--) {
            arr3[i-1]=arr0[j];                      //长度-1才是对应角标！！！
            j++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+"\t");
        }
    }
}
