package hashset;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test1 {
    @Test
    public void test01() {
        HashSet set = new HashSet();
        set.add("aaaa");
        set.add("bbbb");
        set.add("cccc");
        set.add("dddd");
        set.add("eeee");
        set.add("ffff");
        set.add("gggg");
        for (int i = 0; i < 10; i++) {
            System.out.println("set+ " + set);//set+ [gggg, aaaa, bbbb, cccc, dddd, eeee, ffff]
        }
    }

    @Test
    public void test02() {
        LinkedHashSet set = new LinkedHashSet();
        set.add("佳佳");
        set.add("乐乐");
        set.add("文文");
        set.add("乐乐");
        set.add("找李建");
        System.out.println(set);//[佳佳, 乐乐, 文文, 找李建]
    }









}
