public class TestTwoArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {2, 3}, {2, 3, 4}}; //静态初始化
        int[][] arr01 = new int[4][3];         //动态初始化(三个大范围里面有四个元素)
//                              外层 内层
        int[][] arr02 = new int[3][];          //三个外层元素，里面没写，也算对
        arr02[1] = new int[4];
        System.out.println(arr02[1].length);
        System.out.println(arr02[0]);          //没开辟，所以没地址，打印结果为null
        System.out.println(arr02[1]);          //有地址

        System.out.println(arr01.length);       //二维数组的长度是外层数组的长度
        System.out.println(arr01[1].length);    //这样写就是内层数组的长度了

        System.out.println(arr[0][0]);

//用两层for循环遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
