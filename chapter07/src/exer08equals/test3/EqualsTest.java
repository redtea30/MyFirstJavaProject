package exer08equals.test3;

public class EqualsTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(13, 1, 2000);
        MyDate m2 = new MyDate(13, 1, 2000);
        System.out.println(m1.equals(m2));


        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2地址值不相等
        }
        System.out.println(m1); //exer08equals.test3.MyDate@3b07d329
        System.out.println(m2); //exer08equals.test3.MyDate@41629346





    }


}
