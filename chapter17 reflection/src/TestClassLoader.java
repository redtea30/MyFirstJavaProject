import org.junit.jupiter.api.Test;

public class TestClassLoader {
    @Test
    public void test01() {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
    }

    @Test
    public void test02() throws Exception {
        ClassLoader c1 = String.class.getClassLoader();
        System.out.println("加载String类的类加载器：" + c1);

        ClassLoader c2 = Class.forName("sun.util.resources.TimeZoneNamesBundle").getClassLoader();
        System.out.println("加载sun.util.resources.TimeZoneNamesBundle类的类加载器：" + c2);

        ClassLoader c3 = TestClassLoader.class.getClassLoader();
        System.out.println("加载当前类的类加载器：" + c3);
    }

    @Test
    public void test03() {
        ClassLoader c1 = TestClassLoader.class.getClassLoader();
        System.out.println("加载当前类的类加载器c1=" + c1);

        ClassLoader c2 = c1;
        System.out.println("c2="+c2);

        c2 = c1.getParent();
        System.out.println("c1.parent = " + c2);

        ClassLoader c3 = c2.getParent();//c2.parent = null 根加载器
        System.out.println("c2.parent = " + c3);

    }
}