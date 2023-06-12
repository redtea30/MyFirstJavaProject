import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {


    @Test
    public void test01() {
        TreeSet set = new TreeSet();

        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");
        set.add("ee");
        set.add("ff");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }/*aa
bb
cc
dd
ee
ff
*/
    }

    @Test
    public void test02() {
        TreeSet set = new TreeSet();

        set.add(new User("Tom", 12));
        set.add(new User("linda", 11));
        set.add(new User("Jacky", 13));
        set.add(new User("Grase", 15));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(set.contains(new User("Tom", 12)));
    }

    public class User implements Comparable {
        String name;
        int age;

        public User() {
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "User{ name = " + name + " ,age = " + age + " }";
        }

        public int compareTo(Object o) {
            if (this == o) {
                return 0;
            }
            if (o instanceof User) {
                User user = (User) o;
                int value = this.age - user.age;
                if (value != 0) {
                    return value;
                }
                return -this.name.compareTo(user.name);
            }

            throw new RuntimeException("输入的类型不匹配");

        }


    }
}
