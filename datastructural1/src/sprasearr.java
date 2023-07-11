/**
 * ClassName:sprasearr
 * Package:DataStructral
 * Description:
 *
 * @Author Neko
 * @Create 10/07/202311:02 pm
 * @Version 1.0
 */

/*
在前面的基础上，将稀疏数组保存到磁盘上，比如 map.data 恢复原来的数组时，读取map.data 进行恢复
*/

public class sprasearr {
    public static void main(String[] args) {
        //测试printf
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("\t" + i + " " + j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // 创建一个原始的二维数组 11 * 11
        // 0: 表示没有棋子， 1 表示 黑子 2 表蓝子
        // 输出原始的二维数组
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[4][5] = 2;
        System.out.println();




    }
}
