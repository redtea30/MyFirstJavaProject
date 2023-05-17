package ecer04wrapper;


public class WrapperTest {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = new Integer(10);
        System.out.println(i2.toString());

        Integer i3 = Integer.valueOf(11);
        int temp=i3;
        i3=temp+3;
        System.out.println(i3.toString());




    }
}


