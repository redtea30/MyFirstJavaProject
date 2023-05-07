public class ArrayTestReverse {
    public static void main(String[] args) {
        int[] before = new int[]{1, 2, 3, 4, 5};

        //way1 so easy,单指针，没技术含量
        int[] after = new int[before.length];
        for (int i = 0; i < before.length; i++) {
            after[before.length - i - 1] = before[i];
        }
        for (int i = 0; i < before.length; i++) {
            System.out.print(after[i] + "\t");
        }
        System.out.println();

        //way2 单指针，但不用生成新数组
        //旧知识的利用
        int temp;
        int[] before1 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < before1.length / 2; i++) {
            temp = before1[i];
            before1[i] = before1[before1.length - i - 1];
            before1[before1.length - i - 1] = temp;
        }
        for (int i = 0; i < before1.length; i++) {
            System.out.print(before1[i] + "\t");
        }
        System.out.println();


        //way3
        //int[] before = new int[]{1, 2, 3, 4, 5};
        for (int left = 0, right = before.length - 1; left < right; left++, right--) {
            temp = before[left];
            before[left] = before[right];
            before[right] = temp;
        }
        for (int i = 0; i < before.length; i++) {
            System.out.print(before[i] + "\t");
        }

    }
}
