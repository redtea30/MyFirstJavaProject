package Package;

public class Animal {
    private int legs;
    public String name;

    public void setLegs(int n) {
        if (n > 0 && n % 2 == 0) {
            legs = n;
        } else {
            System.out.println("your type here is wrong!");
        }
    }

    public int getLegs() {
        return legs;
    }

    public String eat() {
        return "虫子";
    }
    public void eat2() {
        System.out.println("虫子");
    }


}
