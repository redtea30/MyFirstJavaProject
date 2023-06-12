package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class exer01 {
    public static void main(String[] args) {
        List set = new ArrayList();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(3);
        List set2 = dupicateList(set);
        for (Object obj : set2) {
            System.out.println(obj);
            /*1
2
3*/
        }
    }

    public static List dupicateList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }
}
