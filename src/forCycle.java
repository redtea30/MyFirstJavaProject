public class forCycle {
    public static void main(String[] args) {
/*        for (int num1 = 1; num1 < 100; num++) {

            System.out.println(num1);
        }*/

        //if...else...不是循环
        int num1 = 1;
        if (num1 < 100) {
            num1++;
        } else {
            System.out.println("num = 100" + num1);
        }

        //测试输出boolean结果
        if (num1 > 0) {
            System.out.println("ture");
        } else {
            System.out.println("false");
        }

        for (int i1 = 1; i1 <= 10; i1++) {
            System.out.print(i1);
        }
        System.out.println();
        System.out.println((long)(Math.random()*100000000));


    }
}