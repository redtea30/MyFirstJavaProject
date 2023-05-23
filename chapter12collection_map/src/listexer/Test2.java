package listexer;

import java.util.ArrayList;
import java.util.Collection;

/*1、请定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
        2、创建集合，集合存放随机生成的30个小写字母
        3、用listTest统计，a、b、c、x元素的出现次数
        4、效果如下
[a, u, s, o, s, r, d, x, y, v, i, b, i, q, b, k, q, y, f, l, q, l, l, y, a, r, m, y, u, r]
a:2
b:2
c:0
x:1*/
public class Test2 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            char randomChar = (char) (Math.random() * (122 - 97 + 1) + 97);
            String str = String.valueOf(randomChar);
            list.add(str);
        }
        System.out.println(list);
        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int xCount = listTest(list, "x");
        System.out.println("a:"+aCount);
        System.out.println("b:"+bCount);
        System.out.println("c:"+cCount);
        System.out.println("x:"+xCount);

    }

    public static int listTest(Collection list, String string) {
        int count = 0;
        for (Object obj : list) {
            if (string.equals(obj)) {
                count++;
            }
        }
        return count;
    }
}
