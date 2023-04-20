package CycleTest;

public class MinutesHours {
    public static void main(String[] args) {
//        练习1：**将一天中的时间打印到控制台
        int hour, minutes;
        for (hour = 0; hour < 25; hour++) {
            for (minutes = 0; minutes < 61; minutes++){
                System.out.print("\t"+hour+":"+minutes);
            }
            System.out.println();
        }
    }
}
