package test2;

import java.util.Scanner;

public class Student {
/*
            (1)创建Person类的对象，设置该对象的name、age和gender属性，
                调用study方法，输出字符串“studying”;
                调用showAge()方法，返回age值;
                调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如：2岁。
            (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。*/

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 24;
        p1.gender = '男';
        p1.name = "蓝翔";

        p1.study();
        p1.showAge();
        p1.addAge();

        Person p2 = new Person();
        p2.age = 35;
        p2.gender = '男';
        p2.name = "新东方";

        p2.study();
        p2.showAge();
        p2.addAge();


    }
}

class Person {
    String name;
    int age;
    char gender;

    public void study() {
        System.out.println("studying");
    }

    public int showAge() {
        System.out.println(age);
        return age;
    }

    public int addAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("how much age do you want add?");
        int add = input.nextInt();
        age += add;
        System.out.println(age);
        return age;
    }

}




