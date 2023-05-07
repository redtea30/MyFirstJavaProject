package ValueTransfer;

public class test1c {
    public static void main(String[] args) {

        int m, n;
        m = n = 10;
        System.out.println(m + "--" + n);
        m++;
        System.out.println(m + "--" + n);


        int[] arr = {2};
        int[] arr2 = arr;

        arr[0] = 10;
        System.out.println(arr);
        System.out.println(arr2);

        Order test1 = new Order();
        test1.orderID = 1002;

        Order test2 = test1;
        test2.orderID = 1000;
        System.out.println(test1.orderID);
    }


}

class Order {
    int orderID;
}