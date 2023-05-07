package exer03kidsoverrider;

public class KidTest {
    public static void main(String[] args) {
        Kids kid = new Kids();

        kid.setSalary(1000);
        kid.setSex(1);
        kid.setYearsOld(12);
        kid.printAge();
        kid.manOrWoman();
        kid.employeed();

        Kids kid1 = new Kids(0, 1000, 98);
        kid1.printAge();

    }
}
