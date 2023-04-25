public class ArrayTestReverse {
    public static void main(String[] args) {
        int[] before = new int[]{1, 2, 3, 4, 5};

        //way1 so easy
        int[] after = new int[before.length];
        for (int i = 0; i < before.length; i++) {
            after[before.length - i - 1] = before[i];
        }
        for (int i = 0; i < before.length; i++) {
            System.out.print(after[i] + "\t");
        }


        System.out.println();


    }
}
