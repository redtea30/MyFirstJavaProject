package listexer;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList stuList = new ArrayList();

        for (; ; ) {
            System.out.println("选择（1，录入；0，退出）：");
            int x = scanner.nextInt();
            if (x == 1) {
                System.out.println("姓名：");
                String name = scanner.next();
                System.out.println("年龄：");
                int age = scanner.nextInt();
                Student01 stu = new Student01(age, name);
                stuList.add(stu);
            } else if (x == 0) {
                break;
            } else {
                System.out.println("输入的有误，请重新输入");
            }
        }
        for (Object obj : stuList) {
            System.out.println(obj);
        }
    }
}

class Student01 {
    private int age;
    private String name;

    public Student01(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + " ]";
    }
}

