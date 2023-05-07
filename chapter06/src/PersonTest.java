public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "杰哥";
        p1.age = 25;
        p1.gender = '男';

        System.out.println("name- " + p1.name + " , age- " + p1.age + " ,gender- " + p1.gender);

        p1.eat();
        p1.sleep(8);
        p1.interests("吃喝嫖赌抽");

        Person p2 = new Person();
        p2.name = "阿伟";
        p2.age = 18;
        p2.gender = '男';
        System.out.println("name- " + p2.name + " , age- " + p2.age + " ,gender- " + p2.gender);
        System.out.println("name- " + p1.name + " , age- " + p1.age + " ,gender- " + p1.gender);


    }

}
