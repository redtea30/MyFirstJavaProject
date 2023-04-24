import java.util.Arrays;

public class multidimensionalArray {
    public static void main(String[] args) {
        //some troble here, but i had ate melatonin. I have to sleep now,
        int i, j;
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
/*        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array1[i].length; j++) {
            }
            System.out.print(array1[i][j]);
        }*/
        int[][] array2 = new int[3][2];
        array2 = new int[][]{{1, 2}, {3, 4}, {5, 6}};


        /*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */
        int[][] array3 = new int[5][];
        for (i = 0; i < array3.length; i++) {
            array3[i] = new int[i + 1];//为array3[i]确定每一行元素个数
        }
        for (i = 0; i < array3.length; i++) {
            for (j = 0; j < array3[i].length; j++) {
                array3[i][j] = i + 1;
            }
        }
        for (i = 0; i < array3.length; i++) {
            for (j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

        int[][] array4 = new int[10][];
        for (i = 0; i < array4.length; i++) {
            array4[i] = new int[i + 1];
        }
        System.out.println(array4.length);
        for (i = 0; i < array4.length; i++) {
            for (j = 0; j < array4[i].length; j++) {
                array4[i][j] = i + 1;
            }
        }
        System.out.println(array4.length);
        for (i = 0; i < array4.length; i++) {
            for (j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(array4.length);

        //杨辉三角
/*        **案例3：**使用二维数组打印一个 10 行杨辉三角。
        提示：
        1. 第一行有 1 个元素, 第 n 行有 n 个元素
        2. 每一行的第一个元素和最后一个元素都是 1
        3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即
        yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];*/
        int[][] yanghui = new int[10][];
        for (i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            yanghui[i][0] = yanghui[i][i] = 1;
            for (j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
            }
        }
        for (i = 0; i < yanghui.length; i++) {
            for (j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }






/*        int[][] triangle = new int[10][];
        for (i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
        }
        for (i = 0; i < triangle.length; i++) {
            triangle[i][0] = triangle[i][i] = 1;
        }
        for (i = 0; i < triangle.length; i++) {
            if (i > 1) {
                for (j = 1; j < triangle[i].length; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }*/

      /*  int[][] triangle = new int[10][];
        for (i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = triangle[i][i] = 1;
        }
            for (j = 1; j < triangle[i].length - 1; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        }
        for (i = 0; i < triangle.length; i++) {
            for (j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }
        }


        int[][] yangHui = new int[10][];

        for (i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            yangHui[i][0] = yangHui[i][i] = 1;
            for (j = 1; j < yangHui[i].length - 1; j++) { //非首元素和非末元素的角标范围
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];

            }
        }
        for (i = 0; i < yangHui.length; i++) {
            for (j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }*/


//        创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求元素的值各不相同。
//step1 建立完整数组，忽略数字重复
// /*        int[] num = new int[5];
//        for (int t = 0; t < num.length; t++) {
//            num[t] = (int)(Math.random() * 30 + 1);
//        }
//        System.out.println();
//
//        for (int t = 0; t < num.length; t++) {
//            System.out.print( "\t"+ num[t]);
//        }*/
        //step2 数字重复问题
        int[] num = new int[30];//30为最大值，生成30个不重复的数字
        boolean flag = true;
        for (int t = 0; t < num.length; t++) {
            num[t] = (int) (Math.random() * 30 + 1);
        }
        while (flag) {
            int count = 0;
            for (int t = 0; t < num.length; t++) {
                for (int y = 0; y < t; y++) {
                    if (num[y] == num[t]) {
                        num[t] = (int) (Math.random() * 30 + 1);
                        count++;
                    }

                }
            }
            if (count == 0) {
                flag = false;
            }
        }
        System.out.println();
        for (int t = 0; t < num.length; t++) {
            System.out.print("\t" + num[t]);
        }
        //总结：现阶段我觉得超难，需要加大力度训练









/*        for (i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (30) + 1);
            boolean flag = false;
            while (true){
            for (j = 0; j < i; j++) {

            }
        }*/


    }
}



