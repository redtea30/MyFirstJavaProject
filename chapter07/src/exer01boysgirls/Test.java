package exer01boysgirls;

public class Test {
    public static void main(String[] args) {
        Boy boy1 = new Boy("杰克", 24);
        Girl girl1 = new Girl("朱丽叶", 20);
        girl1.marry(boy1);
        boy1.shout();
        Girl girl2 = new Girl("肉丝", 20);

        int compare = girl1.compare(girl2);
        if(compare > 0){
            System.out.println(girl1.getName() + "大");
        }else if(compare < 0){
            System.out.println(girl2.getName() + "大");
        }else{
            System.out.println("一样大");
        }


    }
}
