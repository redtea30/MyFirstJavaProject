public class Operator {
    public static void main(String[] args){
//+-*/
        //+=
        int num1 = 12;
        int num2 = 12;
        num1 = num1 +2;
        System.out.println(num1);
        num2 += 2;
        System.out.println(num2);

        //++ add int(1) in varable
        int num3 = 12;
        num3 ++;
        System.out.println(num3);

        //% 12%10=2
        int num4 = 12;
        int num5 = 10;
        System.out.println(num4 % num5);

        //*=   12*2=24
        int num6 = 12;
        num6 *= 2;
        System.out.println(num6);

        // >
        int x = 5;
        int y = 3;
        System.out.println(x > y);

        //== Only show the true and false
        System.out.println(x == y);

        //>=
        System.out.println(x >= y);

        //Logical operators
        //&& Logic and
        System.out.println(x < 5 && x < 10);



    }
}
