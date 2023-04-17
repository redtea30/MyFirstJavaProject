public class LogicTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // & 与，且；有false则false
        System.out.println((a > b) & (a > c));//false
        System.out.println((a > b) & (a < c));//false
        System.out.println((a < b) & (a > c));//false
        System.out.println((a < b) & (a < c));//ture
        System.out.println("===============");
        // | 或；有true则true
        System.out.println((a > b) | (a > c));//false
        System.out.println((a > b) | (a < c));//ture
        System.out.println((a < b) | (a > c));//ture
        System.out.println((a < b) | (a < c));//ture
        System.out.println("===============");
        // ^ 异或；相同为false，不同为true
        System.out.println((a > b) ^ (a > c));//false
        System.out.println((a > b) ^ (a < c));//ture
        System.out.println((a < b) ^ (a > c));//ture
        System.out.println((a < b) ^ (a < c));//false
        System.out.println("===============");
        // ! 非；非false则true，非true则false
        System.out.println(!false);//ture
        System.out.println(!true);//false

        //&和&&的区别
        System.out.println((a > b) & (a++ > c));//false
        System.out.println("a = " + a);
        System.out.println((a > b) && (a++ > c));//false
        System.out.println("a = " + a);
        System.out.println((a == b) && (a++ > c));//ture
        System.out.println("a = " + a);
        System.out.println("-------------------------");

        //|和||的区别
        System.out.println((a > b) | (a++ > c));//false
        System.out.println("a = " + a);
        System.out.println((a > b) || (a++ > c));//ture
        System.out.println("a = " + a);
        System.out.println((a == b) || (a++ > c));//false
        System.out.println("a = " + a);


        int x = 1;
        int y = 1;

        if (x++ == 2 & ++y == 2) {
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);
    }


}
