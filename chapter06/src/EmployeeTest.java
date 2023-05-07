public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);

        emp1.id = 114515;
        emp1.name = "阿杰";
        emp1.age = 24;
        emp1.salary = 7777;

        System.out.println("id = " + emp1.id + ",name = " + emp1.name +
                ", age = " + emp1.age + ", salary = " + emp1.salary);

        Employee emp2=new Employee();


        System.out.println("id = " + emp2.id + ",name = " + emp2.name +
                ", age = " + emp2.age + ", salary = " + emp2.salary);//默认值

    }


}
