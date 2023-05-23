package listexer;

import java.util.ArrayList;
import java.util.Scanner;

/*分别使用ArrayList和LinkedList集合，编写一个**`KTV点歌系统`**的程序。在程序中：
        - 指令1代表添加歌曲
        - 指令2代表将所选歌曲置顶
        - 指令3代表将所选歌曲提前一位
        - 指令4代表退出该系统
        要求根据用户输入的指令和歌曲名展现歌曲列表。例如输入指令1，输入歌曲名"爱你一万年"，则输出“当前歌曲列表：[爱你一万年]”。
        **提示**
        - 为了指引用户操作，首先要将各个指令所表示的含义打印到控制台
        ```java
        System.out.println("-------------欢迎来到点歌系统------------");
        System.out.println("1.添加歌曲至列表");
        System.out.println("2.将歌曲置顶");
        System.out.println("3.将歌曲前移一位");
        System.out.println("4.退出");
        ```
        - 程序中需要创建一个集合作为歌曲列表，并向其添加一部分歌曲
        - 通过ArrayList或LinkedList集合定义的方法操作歌曲列表*/
public class Exer03 {
    private static ArrayList musicList = new ArrayList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addMusicList();
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("-------------欢迎来到点歌系统------------");
            System.out.println("1.添加歌曲至列表");
            System.out.println("2.将歌曲置顶");
            System.out.println("3.将歌曲前移一位");
            System.out.println("4.退出");
            int input = scanner.nextInt();
            switch (input) {
                case (1)://1.添加歌曲至列表"
                    addList();
                    break;
                case (2)://2.将歌曲置顶"
                    setTop();
                    break;
                case (3)://3.将歌曲前移一位
                    setBefore();
                    break;
                case (4)://4.退出
/*                    System.out.println("退出系统？Y/N");//未完成，有缘再搞
                    String quit = scanner.next();
                    char charquit = quit.charAt(0);
                    if(charquit==)*/
                    isFlag = false;
                    break;
                default:
                    System.out.println("你输入的有误");
                    break;
            }
        }
    }

    private static void addMusicList() {
        musicList.add("爱你一万年");
        musicList.add("梁祝");
        musicList.add("Lemon");
        musicList.add("Daft punk");
        musicList.add("老男孩");
    }

    public static void addList() {
        System.out.println("请输入想要添加的音乐名称");
        String addSong = scanner.next();
        musicList.add(addSong);
        System.out.println("已添加歌曲: " + addSong);
    }

    public static void setTop() {
        System.out.println(musicList.toString());
        System.out.println("请输入想要置顶的音乐名称");
        String settop = scanner.next();
        int musicIndex = musicList.indexOf(settop);
        if (musicIndex < 0) {
            System.out.println("你输入的歌曲不存在");
        } else if (musicIndex == 0) {
            System.out.println("你输入的歌曲已经置顶了");
        } else {
            String temp = settop.toString();
            int here = musicList.indexOf(settop);
            musicList.remove(here);
            musicList.add(0, temp);
            System.out.println("已将歌曲： " + settop + " 置顶");
        }
    }

    public static void setBefore() {
        System.out.println(musicList.toString());
        System.out.println("请输入想要移动的音乐名称");
        String input = scanner.next();
        int musicIndex = musicList.indexOf(input);
        if (musicIndex < 0) {
            System.out.println("你输入的歌曲不存在");
        } else if (musicIndex == 0) {
            System.out.println("你输入的歌曲已经是第一首了");
        } else {
            musicList.remove(input);
            musicList.add(musicIndex - 1, input);
            System.out.println("已将歌曲： " + input + " 向前面移动了一位");
        }
    }

}




