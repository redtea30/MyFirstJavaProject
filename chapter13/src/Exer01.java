import org.junit.Test;

import java.util.Arrays;

public class Exer01 {

    //编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
    public static <E> void method1(E[] e, int a, int b) {
        E temp = e[b];
        e[b] = e[a];
        e[a] = temp;
    }

    @Test
    public void test1() {
        String[] arr = new String[]{"aa", "bb", "cc"};
        method1(arr, 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    //编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
    public static <E> void method2(E[] e) {
        for (int i = 0, j = e.length - 1; i < j; i++, j--) {
            E temp = e[j];
            e[j] = e[i];
            e[i] = temp;
        }
        System.out.println(e.length    );
    }

    @Test
    public void test2() {
        String[] arr1 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        method2(arr1);
        System.out.println(Arrays.toString(arr1));
    }


}
