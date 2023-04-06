public class arrays {
    //print each element in arrays
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            int temp = i;
            System.out.println(temp + 1 + ". " + cars[i] + ";");
            //politely way to generate result?LOL
        }

  /*  //print each elements in arrays then print 1-4
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            String[] CarsTemp = ;}*/

        //another way print elements in array
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars1) {
            System.out.println(i);
        }

        //Print specific number in arrays myNumbers
        //0 is first element
        int[][] myNumbers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
        System.out.println(myNumbers[0][0] + " " + myNumbers[0][1] + " " + myNumbers[1][0]);
        int[][] myNmbersTemp = myNumbers;
        //change specific number in array myNumbers
        myNmbersTemp[0][0] = 120;
        System.out.println(myNmbersTemp[0][0]);

        //
        int[][] myNumbers2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < myNumbers2.length; ++i) {
            for (int j = 0; j < myNumbers2[i].length; ++j) {
                System.out.println(myNumbers2[i][j]);
            }
        }

        int[][] myNumbers3 = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers3.length; ++i) {
            System.out.println("Start i" + myNumbers3.length);
            for (int j = 0; j < myNumbers3[i].length; ++j) {
                System.out.print(myNumbers3[i].length + " :length i   ");
                System.out.println("Start j");
                System.out.println(myNumbers3[i][j]);
            }
            System.out.println("finished");
        }
        //I forget some knowledge about for loop.


        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 15; ++j) {
                System.out.print(i + " - ");
                System.out.println(j);
            }
        }


    }
}
