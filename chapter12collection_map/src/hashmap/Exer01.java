package hashmap;

import java.util.*;

//**练习1：**添加你喜欢的歌手以及你喜欢他唱过的歌曲
public class Exer01 {
    public static void main(String[] args) {
        HashMap singers = new HashMap();
        String singer1 = "周杰伦";
        String singer2 = "程奕迅";

        ArrayList songs1 = new ArrayList();

        songs1.add("双节棍");
        songs1.add("本草纲目");
        songs1.add("夜曲");
        songs1.add("稻香");
        singers.put(singer1, songs1);
        List songs2 = Arrays.asList("浮夸", "十年", "红玫瑰", "好久不见", "孤勇者");
        singers.put(singer2, songs2);

        Set entrySet = singers.entrySet();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            String singer = (String) entry.getKey();
            List songs = (List) entry.getValue();

            System.out.println("歌手: "+singer);
            System.out.println("歌曲有： "+songs);

        }
    }
}
