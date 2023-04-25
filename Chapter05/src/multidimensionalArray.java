import java.util.Arrays;
import java.util.Scanner;

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

        //测试方法一：有缺陷，会生成一样的数字
        int[] num1 = new int[30];//30为最大值，生成30个不重复的数字
        for (int t = 0; t < num1.length; t++) {
            num1[t] = (int) (Math.random() * 30 + 1);
            for (int y = 0; y < t; y++) {
                if (num1[t] == num1[y]) {
                    t--;
                    break;
                }
            }
        }
        System.out.println();
        for (int t = 0; t < num1.length; t++) {
            System.out.print("\t" + num1[t]);
        }

        //老师的方法
        int[] arr = new int[30];
        for (i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;

            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println();
        for (i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

        //老师的方法2
        arr = new int[30];
        for (i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;

            flag = false;
            while (true) {
                for (j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    arr[i] = (int) (Math.random() * 30) + 1;
                    flag = false;
                    continue;
                }
                break;
            }
        }
        System.out.println();

        for (i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }


        //
        System.out.println();

        int maxLimit = 30;
        int minLimit = 1;
        int[] list = new int[maxLimit];
        for (int g = 0; g < list.length; g++) {
            list[g] = (int) (Math.random() * maxLimit - minLimit + 1) + 1;

            flag = false;
            while (true) {
                for (int h = 0; h < g; h++) {
                    if (list[g] == list[h]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    list[g] = (int) (Math.random() * maxLimit - minLimit + 1) + 1;
                    flag = false;
                    continue;
                }
                break;
            }


        }
        for (int g = 0; g < list.length; g++) {
            System.out.print("\t" + list[g]);
        }


        //杨辉三角复习
        //杨辉三角
/*        **案例3：**使用二维数组打印一个 10 行杨辉三角。
        提示：
        1. 第一行有 1 个元素, 第 n 行有 n 个元素
        2. 每一行的第一个元素和最后一个元素都是 1
        3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即
        yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];*/
/*        if (g > 1) {
            yanghuisanjiao[g][h] = yanghuisanjiao[g - 1][h - 1] + yanghuisanjiao[g - 1][h];
        }*/


        System.out.println();
        int[][] yanghuisanjiao = new int[10][];
        for (int g = 0; g < yanghuisanjiao.length; g++) {
            yanghuisanjiao[g] = new int[g + 1];
            yanghuisanjiao[g][g] = yanghuisanjiao[g][0] = 1;
            for (int h = 1; h < yanghuisanjiao[g].length - 1; h++) {
                yanghuisanjiao[g][h] = yanghuisanjiao[g - 1][h - 1] + yanghuisanjiao[g - 1][h];
            }
        }
        for (int g = 0; g < yanghuisanjiao.length; g++) {
            for (int h = 0; h < yanghuisanjiao[g].length; h++) {


            }
        }


        for (int g = 0; g < yanghuisanjiao.length; g++) {
            for (int h = 0; h < yanghuisanjiao[g].length; h++) {
                System.out.print(yanghuisanjiao[g][h] + "\t");
            }
            System.out.println();
        }

//案例：遍历扑克牌
        /*        提示：使用两个字符串数组，分别保存花色和点数，再用一个字符串数组保存最后的扑克牌。*/
        String[] hua = {"黑桃", "红桃", "梅花", "方片"};
        String[] dian = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[][] gambling = new String[hua.length][];
        for (int g = 0; g < hua.length; g++) {
            gambling[g] = new String[dian.length];
            for (int h = 0; h < dian.length; h++) {
                gambling[g][h] = hua[g] + dian[h];
                System.out.print(gambling[g][h] + " ");
            }
            System.out.println();
        }

        //way2
        System.out.println("way2");
        i = 0;
        String[] pai = new String[hua.length * dian.length];
        for (int g = 0; g < hua.length; g++) {
            for (int h = 0; h < dian.length; h++) {
                pai[i++] = hua[g] + dian[h];
                System.out.print(gambling[g][h] + " ");
            }
            System.out.println();

        }



/*        从键盘输入一个整数（1~20） ，则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。
        例如： 输入数字2，则程序输出：
        1 2
        4 3
        输入数字3，则程序输出：
        1 2 3
        8 9 4
        7 6 5
        输入数字4， 则程序输出：
        1    2    3    4
        12  13  14  5
        11  16  15  6
        10   9   8    7*/


        Scanner input = new Scanner(System.in);
        System.out.print("请输入矩阵的尺寸");
        //int length = input.nextInt();
        int length = 4;//测试
        int x = 0, y = 0;//当前坐标
        //int[][] matrix = new int[length][length];//测试
        int[][] matrix = new int[length][];
        for (x = 0; x < length; x++) {
            matrix[x] = new int[length];
        }//使用这个不执行
        x = 0;//x没有归零出错！！！！！！操
        int total = length * length;
        int k = 1;//k用来判断指针的方向
        for (int m = 1; m < total + 1; m++) {
            if (k == 1) {
                if (x < length && matrix[y][x] == 0) {
                    matrix[y][x++] = m;
                } else {
                    m--;
                    x--;
                    y++;
                    k = 2;
                }
            } else if (k == 2) {
                if (y < length && matrix[y][x] == 0) {
                    matrix[y++][x] = m;
                } else {
                    y--;
                    m--;
                    k = 3;
                    x--;
                }
            } else if (k == 3) {
                if (x >= 0 && matrix[y][x] == 0) {
                    matrix[y][x--] = m;
                } else {
                    m--;
                    y--;
                    k = 4;
                    x++;
                }
            } else if (k == 4) {
                if (y >= 0 && matrix[y][x] == 0) {
                    matrix[y--][x] = m;
                } else {
                    y++;
                    m--;
                    k = 1;
                    x++;
                }
            }
        }
        System.out.println();

        for (int m = 0; m < length; m++) {
            for (int n = 0; n < length; n++) {
                System.out.print(matrix[m][n] + "\t");
            }
            System.out.println();
        }
        input.close();

        //创建回文总结
        /*
                for (x = 0; x < length; x++) {
            matrix[x] = new int[length];
       这个为什么会导致代码不执行啊！！！！----->原因：x没有归零
        为啥一定要int[][] matrix=new int[length][length];
        */
        int testNum = 5;
        int[][] test1 = new int[testNum][];
        for (int n = 0; n < testNum; n++) {
            test1[n] = new int[testNum];
        }

        for (int n = 0; n < testNum; n++) {
            for (int m = 0; m < testNum; m++) {
                System.out.print(test1[n][m]);
            }
            System.out.println();
        }
        System.out.println(test1[0]);
        System.out.println(test1[1]);

        int[][] test2 = new int[5][5];
        for (int n = 0; n < testNum; n++) {
            for (int m = 0; m < testNum; m++) {
                System.out.print(test2[n][m]);
            }
            System.out.println();
        }
    }
}



