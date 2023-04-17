public class arrayExercise {
    public static void main(String[] args) {
/*从小到大排序
        array,byte,short,int,long
        boolean,float,double

        */
//byte byte1 = 123;
        byte byte2 = 127;
        byte2++;
        System.out.println(byte2);//-128(0111 1111-->1111 1111)

/*        int intnum1 = 2200000000;//java: integer number too large
        System.out.println(intnum1
        );*/
/*
        long longnum1 =2200000000;//java: integer number too large
*/
        long longnum1 = 2200000000L;
        System.out.println(longnum1);

        byte byte1 = 1;
        byte2 = 127;
        System.out.println((byte) (byte1 + byte2));

        char char1 = '多';
        char char2 = '少';
/*
        char char3 = char1 +char2;//java: incompatible types: possible lossy conversion from int to char
*/
        System.out.println(char1 + char2);//pintln可以接收各种数据类型的值

        byte1 = 1;
        short short1 = 1;
        int int1 = 114514;
        long long1 = 10;
        System.out.println(byte1 + short1 + int1 + long1);
        System.out.println(byte1 + long1);
        System.out.println(short1 + int1);

        double double1 = 1.1d;
        float float1 = 1.1f;
//        float float2=float1+double1;//java: incompatible types: possible lossy conversion from double to float
        double double2 = float1 + double1;
        System.out.println("double2: " + double2);

        int i = 1;
        System.out.println("i = " + i);//1
        System.out.println("++i = " + i++);//后加一
        System.out.println("i++ = " + ++i);//先加一
        i = 1;
        int j = i++;
        System.out.println("j = " + j);//2
        int k = i++ * ++j + ++i * j++;
        System.out.println("i = " + i);//1
        System.out.println("j = " + j);//2
        System.out.println("k = " + k);//6

        //
        int num1, num2, num3, num4, num5, num6;
        num1 = 1;
        num2 = 2;
        num3 = 3;
        num4 = 4;
        num5 = 5;
        num1 *= 2;
        num2 /= 2;
        num3 += 3;
        num4 -= 4;
        num5 %= 3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        i = 1;//int i已经定义过
        i *= 0.1;
        System.out.println(i);

        float float2 = 1;
        float2 *= 0.1;
        System.out.println(float2);
        float2 = 1;
//        float2 = 0.1 * float2;//java: incompatible types: possible lossy conversion from double to float
        float2 = (float) (0.1 * float2);
        System.out.println(float2);

    }
}
