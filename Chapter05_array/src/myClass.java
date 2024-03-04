public class myClass {
    public static void yangHuiTest() {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;
            for (int j = 0; j < arr[i].length; j++) {
                if (i > 1 & j > 0 & j < i) arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}