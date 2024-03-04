public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0;
        int min = 100;
        int total = 0;
        int avg;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            total += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (i==5) System.out.println();
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        avg = total/ arr.length;
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);
        System.out.println("总和:"+total);
        System.out.println("平均值:"+avg);
    }
}
