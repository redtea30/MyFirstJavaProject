package exer09tostring.test2;

public class ToStringTest {
    public static void main(String[] args) {

        User u = new User("wang", 34);
        System.out.println(u.toString());
    }
}

class User {

    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //手动实现toString()
//    @Override
//    public String toString() {
//        return "User{ name = " + name + ", age = " + age + "}";
//
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}