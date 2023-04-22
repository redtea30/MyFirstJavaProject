class Arraytest {
    public static void main(String[] args) {
        /*        数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3,...};

        或

        数据类型[] 数组名;
        数组名 = new 数据类型[]{元素1,元素2,元素3,...};*/
        System.out.println("This is the first array, that i built.");
        int[] arr = new int[5];
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }
        //为每一个元素赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }

        //最基础的创建数组的方法
        int[] arr1 = new int[]{11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        System.out.println(arr2 + "<-2 1->" + arr1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\n");
        }

        int[] arr3 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i];
        }
        arr3[2] = 5;
        System.out.println(arr3[2]);
        System.out.println(arr2[2]);


    }
}
