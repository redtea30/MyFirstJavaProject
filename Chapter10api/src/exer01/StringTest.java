package exer01;

public class StringTest {
    String Str = "good";
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest1 ex = new StringTest1();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
}
