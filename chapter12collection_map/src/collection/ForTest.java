package collection;

public class ForTest {
    public static void main(String[] args) {
        String[] str = new String[5];
        for (String myStr : str) {
            myStr = "atguigu";
            System.out.println(myStr);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
/*    atguigu
            atguigu
    atguigu
            atguigu
    atguigu
null
        null
        null
        null
        null*/
}
