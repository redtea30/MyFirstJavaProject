package exer03interface.test1;

public class InterfaceTest {
    public static void main(String[] args) {

/*         Bullets2 bullets2 = new Bullets2();
       System.out.println(Flyable.MAX_SPEED);

        bullets2.fly();
        bullets2.attack();

        //多态
        Bullets bullets3 = new Bullets2();
        bullets3.fly();
        bullets3.attack();

        bullets3.attack();
*/

        //
/*        new Flyable() {
            public void method() {
                System.out.println("匿名实现类重写的方法method()");
            }
        }.method();*/




    }

    interface Flyable {
        public static final int MIN_SPEED = 0;
        public static final int MAX_SPEED = 7900;

        public static void fly() {
            System.out.println("interface fly");
        }
    }

    interface Attackable { //接口
        public abstract void attack();
    }

    abstract class Plane implements Flyable {
    }

    class Bullets implements Flyable, Attackable {
        public void fly() {
            System.out.println("让子弹飞");
        }

        public void attack() {
            System.out.println("子弹击中物体");
        }
    }

    class Bullets1 extends Bullets {
        public void fly() {
            System.out.println("让子弹飞2");
        }

        public void attack() {
            System.out.println("子弹击中物体2");
        }
    }

    class Bullets2 extends Bullets1 {
        public void fly() {
            System.out.println("让子弹飞3");
        }

        public void attack() {
            System.out.println("子弹击中物体3");
        }

        public void method() {
            fly();
            // Flyable.super.fly();
        }

    }
}