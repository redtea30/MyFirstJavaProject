package exer02;

public class Nationality {
    String name;
    int age;
    static String nation = "N/A";

    public Nationality(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Nationality() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Nationality.nation = nation;
    }

    public String toString() {
        return "nation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void show() {
        System.out.println(getNation());
    }


}
