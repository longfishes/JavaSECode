//练习：获取arr数组中所有元素的和
public class ArrayExer03 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{2, 3, 4}, {1, 1}, {5, 5}};

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        System.out.println(total);
    }
}
