package CycleTest;

public class MultiplicationTable {
    public static void main(String[] args) {
//9*9multiplication table
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + i + " * "  + j + " = " + (i * j));
            }
            System.out.println();
        }


    }
}
