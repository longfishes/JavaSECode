public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67,5};
        boolean isFlag = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==5){
                isFlag=true;
                index = i;
                break;
            }
        }
        System.out.println(isFlag);
        if (index>=0){
            System.out.println("出现了4，索引值为"+index);
        }else System.out.println("未出现");
    }
}
