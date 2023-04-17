public class StringExercise {
    public static void main(String[] args) {

        //Exercise 1 print string
        String name = "wang";
        int age = 24;
        char gender = '男';
        double height = 170;
        String phoneNumber = "13012341234";

        String personInfo = "Name: " + name + " Age: " + age + " Gender: " + gender + " Height: " + height + " PhoneNumber: " + phoneNumber;
        System.out.println(personInfo);

        //exercise 2
        System.out.println("*    *");                //输出：*    *
        System.out.println("*\t*");                    //输出：*  *
        System.out.println("*" + "\t" + "*");        //输出：*  *
        System.out.println('*' + "\t" + "*");        //输出：*  *
        System.out.println('*' + '\t' + "*");        //输出：51*
        System.out.println('*' + "\t" + '*');        //输出：*  *
        System.out.println("*" + '\t' + '*');        //输出：*  *
        System.out.println('*' + '\t' + '*');        //输出：93

//exercise 3
//        String str1 = 4;                       //判断对错：Wrong
        String str2 = 3.5f + "";               //判断str2对错：Correct
        System.out.println(str2);              //输出：3.5
        System.out .println(3+4+"Hello!");     //输出：7Hello!
        System.out.println("Hello!"+3+4);      //输出：Hello!34
        System.out.println('a'+1+"Hello!");    //输出：98Hello!
        System.out.println("Hello"+'a'+1);     //输出：Helloa1






    }
}
