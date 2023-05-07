import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 2, 9, 1, 1, 2, 3, 2, 4, 5, 123, 34, 23, 43, 2, 5, 345, 6, 047, 23, 4, 6, 98765, 234, 234, 0101011};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //优化
        //int[] arr = new int[]{6, 9, 2, 9, 1,1,2,3,2,4,5,123,34,23,43,2,5,345,6,047,23,4,6,98765,234,234,0101011};
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //方法3 跳过
/*        int[] arr = {1, 3, 5, 7, 9};

        //从小到大排序
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;//假设数组已经是有序的
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //希望的是arr[j] < arr[j+1]
                if (arr[j] > arr[j + 1]) {
                    //交换arr[j]与arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = false;//如果元素发生了交换，那么说明数组还没有排好序
                }
            }
            if (flag) {
                break;
            }
        }

        //完成排序，遍历结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }*/

        //Array.sort();排序
        //Array.toString();打印
        System.out.println();
        int[] test = {1, 2, 4, 5, 6, 3, 2, 1};
        Arrays.sort(test);
        System.out.print(Arrays.toString(test));


    }
}