package exer01;

public class Static {
    private static String name;
    private char gender;
    private boolean isMarry;
    private static int age;


    static {
        age = 18;
        name = "Tom";
    }

    public Static(String name, char gender, boolean isMarry) {
        this.name = name;
        this.gender = gender;
        this.isMarry = isMarry;
    }

    public Static() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isMarry() {
        return isMarry;
    }

    public void setMarry(boolean marry) {
        isMarry = marry;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Static.age = age;
    }


    public String toString() {
        return getAge() + "" + getGender() + "" + getName() + "" + isMarry();
    }
}

class test01 extends Static {
    public test01(String name, char gender, boolean isMarry) {
        super(name, gender, isMarry);
    }

    public test01() {
    }
}