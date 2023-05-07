package Package;

public class AnimalTest {
    public static void main(String[] args) {
        Animal frog = new Animal();
        frog.setLegs(4);
        frog.name = "卢本伟";
        System.out.println("青蛙有 " + frog.getLegs() + " 条腿，青蛙的名字是 " + frog.name + " 青蛙吃" + frog.eat());


    }


}
