package CycleTest;

public class ManyStars {
    public static void main(String[] args) {
        //打印5排星星for
        System.out.println("打印5排星星for");

        int i, j;
        for (i = 1; i < 6; i++) {
            for (j = 1; j < 15; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        //5排递增的星星
        System.out.println("5排递增的星星");
        i = 0;
        j = i;
        for (i = 1; i < 6; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        //5排递减的星星
        System.out.println("5排递减的星星");
        i = 0;
        j = i;
        for (i = 1; i < 6; i++) {
            for (j = 1; j <= 6 - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        //Diamond Shape
        /*
--------*
------* * *
----* * * * *
--* * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
        */
        System.out.println("Diamond Shape");
        for (i = 1; i < 6; i++) {
            for (j = 1; j < (10 - 2 * i); j++) {
                System.out.print("-");
            }
            for (j = 1; j < 2 * i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 1; i < 5; i++) {
            for (j = 1; j <= 2 * i; j++) {
                System.out.print("-");
            }
            for (j = 0; j < 10-2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
