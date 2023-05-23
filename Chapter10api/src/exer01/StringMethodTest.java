package exer01;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class StringMethodTest {
    /*
     * String构造器的使用
     * */
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(s3);
    }

    /*
     * String与常见的其它结构之间的转换
     *
     * 1. String与基本数据类型、包装类之间的转换（复习）
     *
     * 2. String与char[]之间的转换
     *
     * 3. String与byte[]之间的转换（难度）
     * */
    @Test
    public void test2() {
        int num = 10;
        String s1 = num + "";
        String s2 = String.valueOf(num);
        String s3 = "123";
        int i1 = Integer.parseInt(s3);


    }

    //String与char[]之间的转换
    @Test
    public void test3() {
        String str = "hello";
        char[] arr = str.toCharArray();//String-->Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String str1 = new String(arr);//Array-->String
        System.out.println(arr);
    }

    //String与byte[]之间的转换（难度）
    /*
     * 在utf-8字符集中，一个汉字占用3个字节，一个字母占用1个字节。
     * 在gbk字符集中，一个汉字占用2个字节，一个字母占用1个字节。
     *
     * utf-8或gbk都向下兼容了ascii码。
     *
     * 编码与解码：
     *   编码：String ---> 字节或字节数组
     *   解码：字节或字节数组 ----> String
     * 要求：解码时使用的字符集必须与编码时使用的字符集一致！不一致，就会乱码。
     *
     * */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("abc中国");
        byte[] arr = str.getBytes();//String-->Bytes
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        byte[] arr1 = str.getBytes("utf-8");//String-->Bytes指定字符集
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }


        String str1 = new String(arr);//Bytes-->String
        System.out.println(str1);
        String str2 = new String(arr, "utf-8");//Bytes-->String
        System.out.println(str2);

    }
}











