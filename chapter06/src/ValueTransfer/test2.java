package ValueTransfer;

public class test2 {
    public static void main(String[] args) {
        test2 test = new test2();
        int m = 10;
        test.method1(m);
        System.out.println(m);
        Person p = new Person();
        p.age = 10;
        test.method2(p);
        System.out.println(p.age);
    }

    public void method1(int m) {
        m++;
    }

    public void method2(Person p) {
        p.age++;
    }

}

class Person {
    int age;
}