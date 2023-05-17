package exer01;

public class HappyNewYear {
    public static void main(String[] args) {
        for (int i = 10; i > -1; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (i > 0) {
                System.out.println("距离新年还有： " + i + " 秒钟。");
            } else {
                System.out.println("HappyNewYear");
            }
        }
    }
}
