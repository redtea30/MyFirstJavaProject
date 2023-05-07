public class Person {
    String name;
    int age;
    char gender;

    public void eat() {
        System.out.println("人要吃饭");
    }

    public void sleep(int hour) {
        System.out.println("人需要保证晚上至少" + hour + " 小时的睡眠。");
    }

    public void interests(String hobby) {
        System.out.println("我的爱好是： " + hobby);
    }

}
