public class ArrayExer06 {
    public static void main(String[] args) {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 30 + 1);
                for (int j = 0; j < i; j++) {
                    if (arr[i]==arr[j]){
                        i--;
                        break;
                    }
                }
            }

        for (int i = 0; i < arr.length; i++) {
            if (i%5==0)System.out.println();
            System.out.print(arr[i]+"\t");
        }
    }
}
