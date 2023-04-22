class Arraytest {
    public static void main(String[] args){
        /*        数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3,...};

        或

        数据类型[] 数组名;
        数组名 = new 数据类型[]{元素1,元素2,元素3,...};*/
        System.out.println("This is the first array, that i built.");
        int[] arr = new int[5];
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);}



    }
}
