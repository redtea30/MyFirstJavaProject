package exer01;

public class SingleThread {
    public void method1(String str) {
        System.out.println(str);
    }

    public void method2(String str) {
        method1(str);
    }

    public static void main(String[] args) {
        SingleThread s = new SingleThread();
        s.method2("hello!");
    }

}
