package exer03kidsoverrider;

public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        setSex(sex);
        setSalary(salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(yearsOld + "yearsOld" + getSex() + getSalary());
    }

    public void employeed() {
        System.out.println("学生应该多学习");
    }
}
