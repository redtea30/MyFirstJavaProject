package collection;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;

public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add("黎文江");
        coll.add("王家明");
        coll.add("江叔贤");
        System.out.println(coll);//[黎文江, 王家明, 江叔贤]

        System.out.println(coll.size());//3
        Collection coll1 = new ArrayList();
        coll1.add(1);
        coll1.add(2);
        coll1.add(3);
        System.out.println(coll1.size());//3

        Collection coll2 = new ArrayList();
        Collection coll3 = new ArrayList();
        coll2.add(coll);
        coll2.add(coll1);
        System.out.println(coll2.size());//2 add会将整个集合作为元素加入
        System.out.println(coll2);//[[黎文江, 王家明, 江叔贤], [1, 2, 3]]

        coll3.addAll(coll);
        coll3.addAll(coll1);
        System.out.println(coll3.size());//6
        System.out.println(coll3);//[黎文江, 王家明, 江叔贤, 1, 2, 3]

    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add("黎文江");
        coll.add("王家明");
        coll.add("江叔贤");
        System.out.println(coll.isEmpty());//false
        System.out.println(coll.contains("黎文江"));//true

        Collection coll1 = new ArrayList();
        coll1.add("黎文江");
        coll1.add("王家明");
        System.out.println(coll.containsAll(coll1));//true 即coll1是coll的子集
        System.out.println(coll.equals(coll1));//false

        coll1.add("江叔贤");//补全
        System.out.println(coll.equals(coll1));//true
    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        Collection coll1 = new ArrayList();
        Collection coll2 = new ArrayList();
        Collection coll3 = new ArrayList();

        coll.add("黎文江");
        coll.add("王家明");
        coll.add("江叔贤");
        coll.add("陈桂芳");
        coll.add("其家军");
        coll.add("赵家杨");
        coll1.addAll(coll);
        coll2.addAll(coll);
        coll3.addAll(coll);

        System.out.println(coll);//[黎文江, 王家明, 江叔贤, 陈桂芳, 其家军, 赵家杨]
        coll.clear();
        System.out.println(coll);//[]

        coll1.remove("黎文江");
        System.out.println(coll1);//[王家明, 江叔贤, 陈桂芳, 其家军, 赵家杨]
        coll2.removeAll(coll1);
        System.out.println(coll2);//[黎文江]

        coll2.add("其家军");
        coll2.add("赵家杨");
        coll2.add("冰淇淋");
        coll2.add("甜筒");
        System.out.println(coll2);//[黎文江, 其家军, 赵家杨, 冰淇淋, 甜筒]

        coll3.retainAll(coll2);
        System.out.println(coll3);//[黎文江, 其家军, 赵家杨]
    }

    @Test
    public void test4() {
        Collection coll = new ArrayList();
        coll.add("黎文江");
        coll.add("王家明");
        coll.add("江叔贤");
        coll.add("陈桂芳");
        coll.add("其家军");
        coll.add("赵家杨");
        Object[] object = coll.toArray();
        for (int i = 0; i < object.length; i++) {
            System.out.print(object[i]);//黎文江王家明江叔贤陈桂芳其家军赵家杨
        }
        System.out.println();
        //用数组返回所有元素
        System.out.println(Arrays.toString(object));//[黎文江, 王家明, 江叔贤, 陈桂芳, 其家军, 赵家杨]

        Collection coll1 = Arrays.asList(object);//数组转集合
        System.out.println(coll1);//[黎文江, 王家明, 江叔贤, 陈桂芳, 其家军, 赵家杨]
    }

    @Test
    public void test5() {
        Collection coll = new ArrayList();
        coll.add("黎文江");
        coll.add("王家明");

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //黎文江
        //王家明

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());//java.util.NoSuchElementException
    }


    @Test
    public void test6() {
        Collection coll = new ArrayList();
        coll.add("黎文江");
        coll.add("王家明");

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //黎文江
        //王家明

/*
        if (iterator.equals("王家明")) {
            iterator.remove();//这样会删除整个列表
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
    }


    @Test
    public void test06() {
        Collection coll = new ArrayList();
        coll.add("黎文江");
        coll.add("王家明");
        coll.add("江叔贤");
        coll.add("陈桂芳");
        coll.add("其家军");
        coll.add("赵家杨");
        Iterator iterator = coll.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator iterator2 = coll.iterator(); // 获取新的迭代器对象
        while (iterator2.hasNext()) {
            Object obj = iterator2.next();
            if (obj.equals("王家明")) {
                iterator2.remove();
            }
        }
        System.out.println("**********");
        Iterator iterator3 = coll.iterator();//使用新的迭代器进行操作
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
    }

    //要删除以下集合元素中的偶数
    @Test
    public void test07() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(5);
        coll.add(6);

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            Integer element = (Integer) iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(coll);
    }

    @Test
    public void test08() {
        Collection coll = new ArrayList();
        coll.add("黎文江");
        coll.add("王家明");
        coll.add("江叔贤");
        coll.add("陈桂芳");
        coll.add("其家军");
        coll.add("赵家杨");
        System.out.println("before coll: " + coll);
        //before coll: [黎文江, 王家明, 江叔贤, 陈桂芳, 其家军, 赵家杨]
        coll.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                String str = (String) o;
                return str.contains("家");
            }
        });
        System.out.println("删除包含\"家\"字的元素之后coll = " + coll);
        //删除包含"家"字的元素之后coll = [黎文江, 江叔贤, 陈桂芳]
    }

    @Test
    public void test09() {
        Collection coll = new ArrayList();
        coll.add("黎文江");
        coll.add("王家明");
        coll.add("江叔贤");
        coll.add("陈桂芳");
        coll.add("其家军");
        coll.add("赵家杨");

        for (Object o : coll) {
            System.out.println(o);
        }/*黎文江
                王家明
        江叔贤
                陈桂芳
        其家军
                赵家杨*/
    }

    @Test
    public void test10() {
        Collection coll = new ArrayList();
        int[] nums = {1, 2, 3, 4};
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("-----------------");

        String[] names = {"家家乐", "美珍香", "星巴克", "肯德基"};
        for (String name : names) {
            System.out.println(name);
        }
/*        1
        2
        3
        4
                -----------------
                家家乐
        美珍香
                星巴克
        肯德基*/
    }

    @Test
    public void test11() {
        List<String> list = new ArrayList<String>();
        list.add("黎文江");
        list.add("王家明");
        list.add("江叔贤");

        System.out.println(list);//[黎文江, 王家明, 江叔贤]
        list.add(1, "张家窑");//增
        System.out.println(list);//[黎文江, 张家窑, 王家明, 江叔贤]

        list.remove(1);//删
        System.out.println(list);//[黎文江, 王家明, 江叔贤]

        list.set(1, "佳佳");//改
        System.out.println(list);//[黎文江, 佳佳, 江叔贤]

        System.out.println(list.indexOf("佳佳"));//1 查

        System.out.println(list.size());//3
        for (int i = 0; i < list.size(); i++) {//使用list.size进行遍历
            System.out.println(list.get(i));
        }/*黎文江
                佳佳
        江叔贤*/

        for(String string: list){//使用增强for循环来遍历
            System.out.println(string);
        }/*黎文江
                佳佳
        江叔贤*/
    }

    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//[1,2]
    }
    private static void updateList(List list) {
        list.remove(2);
    }
}





