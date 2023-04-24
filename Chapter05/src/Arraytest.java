import java.util.Scanner;

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

        //set each element in arr2 to arr3
        int[] arr3 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i];
        }
        arr3[2] = 5;//prove this way works
        System.out.println(arr3[2]);//5
        System.out.println(arr2[2]);//33

        //老师给的小练习，看看就好
        int[] arr4 = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr4[index[i]];
        }
        System.out.println("联系方式：" + tel);

        //输出对应的周几
/*        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};//这里绝对不可以写成加号
        Scanner input = new Scanner(System.in);
        System.out.println("周几（数字）：");
        int whichDay;
        whichDay = input.nextInt();
        if (whichDay > 0 && whichDay < 8) {
            System.out.println(weeks[whichDay-1]);
        } else {
            System.out.println("your type is wrong");
        }
        input.close;
        */

        //n个学生的成绩
/*        Scanner input = new Scanner(System.in);
        System.out.println("请输入有几个学生");
        int peopleNum = input.nextInt();
        int[] scores = new int[peopleNum];
        int maxScore = 0;

        System.out.println("请分别输入学生的成绩");
        for (int i = 0; i < peopleNum; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        System.out.println("一共有" + peopleNum + "名学生，成绩最高的为" + maxScore + "分。");
        //分级
        char grade = 0;
        for (int i = 0; i < peopleNum; i++) {
            if (scores[i] >= 90 & scores[i] <= 100) {
                grade = 'A';
            } else if (scores[i] >= 80) {
                grade = 'B';
            } else if (scores[i] >= 70) {
                grade = 'C';
            } else if (scores[i] >= 0 && scores[i] < 70) {
                grade = 'D';
            }
            System.out.println("student" + i + " score is " + scores[i] + " grade is " + grade);
        }
        input.close();*/

        //练习创建数组
        //way1
        int[] array1;
        array1 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        System.out.println();
        //way2
        int[] array2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }
        System.out.println();
        //way3
        int[] array3 = new int[5];
        array3 = new int[]{1, 2, 3, 4, 5};
        //way4
        int[] array4 = new int[5];
        array4[0] = 1;
        array4[1] = 2;
        array4[2] = 3;
        array4[3] = 4;
        array4[4] = 5;
        //boolean
        boolean[] array5 = new boolean[5];
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i]);
        }
        System.out.println();
        //boolean
        boolean[] array6 = new boolean[5];
        array6 = new boolean[]{true, true, true, true, true};
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i]);
        }
        System.out.println();
        //char
        char[] array7 = new char[5];
        array7 = new char[]{'男','女','老','少','贫'};
        for (int i = 0; i < array7.length; i++) {
            System.out.print((int)array7[i]+"\t");
        }
        System.out.println();
    }
}
