import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

public class exer {
    public static void main(String[] args) {
        //（1）创建一个ArrayList集合对象，并指定泛型为<Integer>
        ArrayList<Integer> coll = new ArrayList<Integer>();
        //（2）添加5个[0,100)以内的整数到集合中
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            coll.add(random.nextInt(0,100));
        }
        //（3）使用foreach遍历输出5个整数
        for (Object obj : coll) {
            System.out.println(obj);
        }
        //（4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Ineteger>
        //way1
        coll.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });


        //（5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

    }
}
