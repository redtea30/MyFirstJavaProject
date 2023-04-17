class Operator {
    public static void main(String[] args) {
//+-*/
        //+=
        int num1 = 12;
        int num2 = 12;
        num1 = num1 + 2;
        System.out.println(num1);
        num2 += 2;
        System.out.println(num2);

        //++ add int(1) in varable
        int num3 = 12;
        num3++;
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

        //分别输出四位数千位，百位，十位，个位的数值(拓展）
        int num7 = 4275;
        System.out.println(num7 % 10);
        System.out.println(num7 / 10 % 10);
        System.out.println(num7 / 100 % 10);
        System.out.println(num7 / 1000);
        int num8 = 42757654;
        System.out.println("1 " + num8 % 10);
        System.out.println("2 " + num8 / 10 % 10);
        System.out.println("3 " + num8 / 100 % 10);
        System.out.println("4 " + num8 / 1000 % 10);
        System.out.println("5 " + num8 / 10000 % 10);
        System.out.println("6 " + num8 / 100000 % 10);
        System.out.println("7 " + num8 / 1000000 % 10);
        System.out.println("8 " + num8 / 10000000 % 10);

        //战士连续战斗89小时，问战士战斗了多少天多少小时
        int soldier = 89;
        System.out.println("战士奋战了： " + soldier / 24 + " Days " + soldier % 24 + " Hours.");

        //
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i=" + i); //10
        System.out.println("i1=" + i1);//11
        i = ++i1;
        System.out.print("i=" + i);//12
        System.out.println("i1=" + i1);//12
        i = i2--;
        System.out.print("i=" + i);//20
        System.out.println("i2=" + i2);//19
        i = --i2;
        System.out.print("i=" + i);//18
        System.out.println("i2=" + i2);//18

        //
        System.out.println("5+5=" + 5 + 5); //打印结果是？ 5+5=55 ?//”5+5“是String类型

        //
        i = 1;
        int j = i++ + ++i * i++;//i每次都参与运算
        System.out.println("j = " + j);

        //企业真题
        i = 2;
        j = i++;
        System.out.println(j);//2

        int m = 2;
        m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
        System.out.println(m);//2

        int num9 = 12;
        num9 %= 5;
        System.out.println(num9);


        //Compare Operator
        i1 = 10;
        i2 = 20;

        System.out.println(i1 == i2);//false
        System.out.println(i1 != i2);//true
        System.out.println(i1 >= i2);//false


        m = 10;
        int n = 20;
        System.out.println(m == n);//false
        System.out.println(m = n);//20

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1 == b2);//false
        System.out.println(b1 = b2);//true 意思是b2赋值给了b1

















    }

}
