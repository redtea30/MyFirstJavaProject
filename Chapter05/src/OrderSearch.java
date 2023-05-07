public class OrderSearch {
    /*        **1、顺序查找**

        顺序查找：挨个查看

        要求：对数组元素的顺序没要求*/
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9, -1};
        int count = 0;
        int target = -1;
        boolean find = false;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] == target) {
                find = true;
                break;
            }
        }
        if (find == true) {
            System.out.println(target + " 的下标是: " + count);
        } else {
            System.out.println("没找到");
        }

        //二分法查找
        //要求数列必须是有序的
        int[] arr3 = new int[]{-99, -54, -2, 0, 2, 33, 43, 256, 999};
        int value = 25;
        int head = 0;
        int end = arr3.length - 1;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (arr3[middle] == value) {
                System.out.println("找到了");
                break;
            } else if (arr3[middle] < value) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        if (head > end) {
            System.out.println("没找到");
        }

    }
}
