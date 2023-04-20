import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        //&&且
        int heartRate = 89;
        if (heartRate >= 60 && heartRate <= 100) {
            System.out.println("你看起来没什么问题");
        } else {
            System.out.println("你需要做进一步的检查");
        }

        //||或
        if (heartRate > 100 || heartRate < 60) {
            System.out.println("你需要做进一步的检查");
        } else {
            System.out.println("你看起来没什么问题");
        }

        //Math.random()奇偶数判断
        int randomNum = (int) (Math.random() * 100);
        if (randomNum % 2 == 0) {
            System.out.println(randomNum + "是偶数");
        } else {
            System.out.println(randomNum + "是奇数");
        }

        //屁股打烂，小明的环球影城梦想
        int scoreOfMing = (int) (Math.random() * 101);//Math.random生成的随机数[0,1)取值101可以等于100分
        System.out.print("小明的成绩是： " + scoreOfMing + "分。");
        if (scoreOfMing == 100) {
            System.out.println("奖励一张环球影城门票");
        } else if (scoreOfMing > 80 && scoreOfMing <= 99) {
            System.out.println("奖励一个玩具水枪");
        } else if (scoreOfMing >= 60 && scoreOfMing <= 80) {
            System.out.println("奖励一顿华莱士");
        } else {
            System.out.println("奖励屁股一顿皮带大餐");
        }

        //另一种写法
        scoreOfMing = (int) (Math.random() * 100);
        System.out.print("小明的成绩是： " + scoreOfMing + "分。");
        if (scoreOfMing == 100) {
            System.out.println("奖励一张环球影城门票");
        } else if (scoreOfMing > 80) {
            System.out.println("奖励一个玩具水枪");
        } else if (scoreOfMing >= 60) {
            System.out.println("奖励一顿华莱士");
        } else {
            System.out.println("奖励屁股一顿皮带大餐");
        }

        //三个变量大小比较
        int randomNum1 = (int) (Math.random() * 100);
        int randomNum2 = (int) (Math.random() * 100);
        int randomNum3 = (int) (Math.random() * 100);
        System.out.print("三个数从小到大的排列顺序是： ");
        if (randomNum1 >= randomNum2) {
            if (randomNum3 <= randomNum2) {
                System.out.println("randomNum3-" + randomNum3 + "randomNum2-" + randomNum2 + "randomNum1-" + randomNum1);
            } else if (randomNum3 >= randomNum1) {
                System.out.println("randomNum2-" + randomNum2 + "randomNum1-" + randomNum1 + "randomNum3-" + randomNum3);
            } else {
                System.out.println("randomNum2-" + randomNum2 + "randomNum3-" + randomNum3 + "randomNum1-" + randomNum1);
            }
        } else {
            if (randomNum3 <= randomNum1) {
                System.out.println("randomNum3-" + randomNum3 + "randomNum1-" + randomNum1 + "randomNum2-" + randomNum2);
            } else if (randomNum3 >= randomNum2) {
                System.out.println("randomNum1-" + randomNum1 + "randomNum2-" + randomNum2 + "randomNum3-" + randomNum3);
            } else {
                System.out.println("randomNum1-" + randomNum1 + "randomNum3-" + randomNum3 + "randomNum2-" + randomNum2);
            }
        }

        //Practical1
        int numX1 = 4;
        int numY1 = 1;
        if (numX1 > 2) {
            if (numY1 > 2)
                System.out.println(numX1 + numY1);
            System.out.println("Java test 1");//只输出这里
        } else
            System.out.println("x is " + numX1);

        //practical2
        boolean b = true;//c
        //如果写成if(b=false)能编译通过吗？如果能，结果是？
        if (b == false)     //建议：if(!b)
            System.out.println("a");
        else if (b)
            System.out.println("b");
        else if (!b)
            System.out.println("c");
        else
            System.out.println("d");

        //practical3 big small number exchange
//        定义两个整数，分别为small 和 big，如果第一个整数small大于第二个整数big，就交换。输出显示small和big变量的值。
        int numSmall = 10;
        int numBig = 1;
        if (numSmall > numBig) {
            numBig = numSmall + numBig;
            numSmall = numBig - numSmall;
            numBig = numBig - numSmall;
            System.out.println("Small: " + numSmall + " Big" + numBig);

        } else {
            System.out.println("Small: " + numSmall + " Big" + numBig);
        }

        //Practical4
/*        小明参加期末Java考试，通过考试成绩，判断其Java等级，成绩范围[0,100]

        - 90-100      优秀
                - 80-89        好
                - 70-79        良
                - 60-69        及格
                - 60以下    不及格*/
        System.out.println("小明的成绩范围是：[0,100]");
        int scoreMing = 89;
        if (scoreMing > 100 || scoreMing < 100) {
            System.out.println("你输入的成绩有误");
        } else if (scoreMing >= 90) {
            System.out.println("优秀");
        } else if (scoreMing >= 80) {
            System.out.println("好");
        } else if (scoreMing >= 70) {
            System.out.println("良");
        } else if (scoreMing >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        //编写程序，声明2个int型变量并赋值。判断两数之和，如果大于等于50，打印“hello world!”
        int num1, num2;
        num1 = 90;
        num2 = 30;
        if (num1 + num2 > 50) {
            System.out.println("Hello");
        }
//        编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
        double dou1, dou2;
        dou1 = 11.1;
        dou2 = 11.3;
        if (dou1 > 10 && dou2 < 20) {
            System.out.println(dou1 * dou2);
        }

//Practical
/*        如果大于95℃，则打印“开水”；
        如果大于70℃且小于等于95℃，则打印“热水”；
        如果大于40℃且小于等于70℃，则打印“温水”；
        如果小于等于40℃，则打印“凉水”。*/
        int waterTemperature = (int) (Math.random() * 101);
        if (waterTemperature > 95) {
            System.out.println("开水");
        } else if (waterTemperature > 70) {
            System.out.println("热水");
        } else if (waterTemperature > 40) {
            System.out.println("温水");
        } else {
            System.out.println("Cold water");
        }


    }
}