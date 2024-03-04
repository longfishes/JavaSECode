/**
 * 一维数组
 */
public class TestOneArray {
    public static void main(String[] args) {
        int[] num;  //声明
        num = new int[]{1,3,5};  //赋值
        //     角标      0 1 2

//初始化完成长度确定，不可更改
        double[] prices = new double[]{10.22,11.45,6.77};//静态初始化
        String[] foods = new String[4];     //动态初始化，只声明了长度
        foods[0] = "sandwich";
        foods[0] = "sandwiches";
        int[] num1 = new int[]{1,2,3,4};
        int[] num2 = {1,2,3,4};             //也可以这样写
//      int[] num3 = new int[3]{1,2,3};       错误的写法

        System.out.println(num[1]);
        System.out.println(num1[3]);
        System.out.println(num2[2]);
        System.out.println(prices[1]);
        System.out.println(foods[0]);

        System.out.println(foods.length);

        for (int i=0;i<num.length;i++){
            System.out.println("循环1："+num[i]);
        }

        System.out.println();

        for (int i : num) {
            System.out.println("循环2：" + i);
        }

//数组元素的默认值
        int[] arr = new int[3];
        String[] str = new String[3];
        double[] dou = new double[3];
        char[] chars = new char[3];
        boolean[] booleans = new boolean[3];

        System.out.println(arr[0]);
        System.out.println(str[0]);
        System.out.println(dou[0]);
        System.out.println(chars[0]);
        System.out.println(chars[0]+1);
        System.out.println(booleans[0]);

        int[] arr0 = arr;
        System.out.println(arr);
        System.out.println(arr0);  //打印的是地址


    }
}
