public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        int target = 5;
        int head = 0;
        int end = arr.length - 1;
        boolean isFlag = true;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (target == arr[middle]) {
                System.out.println("找到了" + target + "，对应位置为" + middle);
                isFlag = false;
                break;
            } else if (target > arr[middle]) {
                head = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (isFlag) System.out.println("没找到");
    }
}
