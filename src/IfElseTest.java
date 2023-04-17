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
        int scoreOfMing = (int) (Math.random() * 100);
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


    }
}
