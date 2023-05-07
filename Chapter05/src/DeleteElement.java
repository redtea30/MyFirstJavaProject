public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //删除数组中索引为4的元素
        int target = 4;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < target; i++) {
            newArr[i] = arr[i];
        }
        for (int i = target; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //way2
        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int i = target - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
