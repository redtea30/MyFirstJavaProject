package Package.employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] emps = new Employee[2];//2可以替换成为其他值
        for (int i = 0; i < emps.length; i++) {
            emps[i] = new Employee();
            System.out.println("----------添加第" + (i + 1) + "个员工----------");
            System.out.println("请输入名字： ");
            String name = input.next();
            System.out.println("请输入性别： ");
            char gender = input.next().charAt(0);
            System.out.println("请输入年龄： ");
            int age = input.nextInt();
            System.out.println("请输入电话号码： ");
            long phonenumber = input.nextLong();
            //给employee内部赋值
            emps[i].setGender(gender);
            emps[i].setAge(age);
            emps[i].setName(name);
            emps[i].setPhonenumber(phonenumber);
        }


        System.out.println("---------------员工列表------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < emps.length; i++) {
            System.out.println((i + 1) + "\t" + emps[i].getInfo());
        }
        System.out.println("----------员工列表----------");
    }
}
