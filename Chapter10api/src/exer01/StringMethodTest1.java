package exer01;

import org.junit.Test;

/*
*   （1）boolean isEmpty()：字符串是否为空
    （2）int length()：返回字符串的长度
    （3）String concat(xx)：拼接
    （4）boolean equals(Object obj)：比较字符串是否相等，区分大小写
    （5）boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，不区分大小写
    （6）int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较大小
    （7）int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
    （8）String toLowerCase()：将字符串中大写字母转为小写
    （9）String toUpperCase()：将字符串中小写字母转为大写
    （10）String trim()：去掉字符串前后空白符
    （11）public String intern()：结果在常量池中共享
*
* */
public class StringMethodTest1 {
    @Test
    public void test1() {
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

      /*  String s4 = null;
        System.out.println(s4.isEmpty());//空指针异常*/

        String s5 = "hello";
        System.out.println(s5.length());

    }

    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abcd";
        String s4 = "adef";
        System.out.println(s3.compareTo(s4));

        String s5 = "abcd";
        String s6 = "Abcd";
        System.out.println(s5.compareTo(s6));
        System.out.println(s5.compareToIgnoreCase(s6));


/*        String s7 = "AliBaba";
        System.out.println(s7.toLowerCase());*/

        String s7 = "张ab";
        String s8 = "李cd";
        System.out.println(s7.compareTo(s8));

        String s9 = " he  llo   ";
        System.out.println("****" + s9.trim() + "*****");
    }

    @Test
    public void test3() {
        String s1 = "michale";
        String[] s2 = {"a", "b", "c"};
        System.out.println(s1.contains("mi"));
        System.out.println(s2[1].contains("b"));

        String s3 = "tringleandroundarethegeometry";
        System.out.println(s3.indexOf("geo"));
        System.out.println(s3.indexOf("geo", 19));
        System.out.println(s3.lastIndexOf("geo"));
        System.out.println(s3.indexOf("geo"));

        System.out.println(s3.substring(2));
        System.out.println(s3.substring(0,10));

        System.out.println(s3.charAt('a'));



    }

}
