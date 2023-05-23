package exer01;

public class Demo {
    public static void main(String[] args) {
       String s1 = "Hello";
        String s2 = "World";
        String s3 = (s1+s2).intern();//intern方法拼接，结果在常量池
        System.out.println(s3);
        System.out.println(s3 == s1);
        System.out.println(s1 == s2);

        String s4 = s1 + s2;
        String s5 = "HelloWorld";
        System.out.println(s4 == s3);
        System.out.println(s5 == s3);//true
        System.out.println(s5 == s4);
        String s6 = "Hello" + "World";
        System.out.println("s6" +(s6 == s5) );//true


        String str = "hello";
        String str2 = "world";
        String str3 = "helloworld";

        String str4 = "hello".concat("world");//contact拼接结果在堆
        String str5 = "hello" + "world";

        System.out.println(str3 == str4);
        System.out.println(str3 == str5);



    }
}
