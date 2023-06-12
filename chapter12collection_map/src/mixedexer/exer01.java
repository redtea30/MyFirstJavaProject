package mixedexer;

//**练习1：**在一个List集合中存储了多个无大小顺序并且有重复的字符串，定义一个方法，让其有序(从小到大排序)，并且不能去除重复元素。
//提示：考查ArrayList、TreeSet

//没看懂
/*
public class exer01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("ccc");
        list.add("ccc");
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ddd");
        sort(list);

    }

    public static void sort(List list) {
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                int num = s1.compareTo(s2);
                return num == 0 ? 1 : num;

            }
        });
        ts.addAll(list);
        list.clear();
        list.addAll(ts);


    }
}
*/
