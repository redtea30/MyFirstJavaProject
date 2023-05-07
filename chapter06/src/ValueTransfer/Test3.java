package ValueTransfer;

public class Test3 {
    public static void main(String[] args) {
        Test3 testV = new Test3();
        Data data = new Data();

        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + ", n = " + data.n);

        testV.swap(data);
        System.out.println("m = " + data.m + ", n = " + data.n);




    }

    public void swap(Data data) {
        int temp = data.n;
        data.n = data.m;
        data.m = temp;
    }


}

class Data {
    int m, n;
}