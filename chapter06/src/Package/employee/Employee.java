package Package.employee;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private long phonenumber;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGender(char n) {
        gender = n;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int n) {
        age = n;
    }

    public int getAge() {
        return age;
    }

    public void setPhonenumber(long n) {
        phonenumber = n;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public String getInfo() {
        return  name + "\t" + gender + "\t" + age + "\t" + phonenumber;
    }


}
