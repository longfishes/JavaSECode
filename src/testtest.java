import java.util.Arrays;

public class testtest {

    public static void main(String[] args) {
        int[][] board = new int[][]{{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(Arrays.deepToString(board));

        f(board);
        System.out.println(Arrays.deepToString(board));
    }


    public static void f(int[][] board){
        board[2][2] = 0;
    }
}
