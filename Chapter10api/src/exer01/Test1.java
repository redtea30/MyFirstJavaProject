package exer01;

public class Test1 {
    public static void main(String[] args) {

        StringTest01 s = new StringTest01();
        String s1 = "   sajdhfkjashdkf     ";
        System.out.println(s.cancelBlank(s1));

        String s2 = "aaabbbcccdddeeefff";
        System.out.println(s.reverse1(s2, 3, 8));

        String reverseStr2 = "aaabbbcccdddeeefff";
        System.out.println(s.reverse2(reverseStr2, 0, 8));

        String str1 = "abhabjldfjkjabjkdijabjdkfjoajbkjlfjlabjkjfljlkjlabjljljkdfjajbab";
        String str2 = "ab";
        System.out.println(s.getCount(str1, str2));//7次

    }
}

class StringTest01 {
    public String cancelBlank(String string) {//模拟trim效果
        if (string != null) {
            int start = 0;
            int end = string.length() - 1;
            while (start < end && string.charAt(start) == ' ') {
                start++;
            }
            while (start < end && string.charAt(end) == ' ') {
                end--;
            }
            if (string.charAt(start) == ' ') {
                return "";
            }
            return string.substring(start, end + 1);


        }

        return null;
    }

    public String reverse1(String string, int start, int end) {//将一个字符串进行反转。将字符串中指定部分进行反转。
        if (string != null) {

            char[] charArray = string.toCharArray();
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            return new String(charArray);
        }
        return null;
    }


    public String reverse2(String str, int start, int end) {//reverse2 我叫他三明治方法
        String newstr = str.substring(0, start);
        for (int i = end; i >= start; i--) {
            newstr += str.charAt(i);
        }
        newstr += str.substring(end + 1);
        return newstr;
    }

    //题目3：
    // 判断str2在str1中出现的次数
/*    题目3：获取一个字符串在另一个字符串中出现的次数。
    比如：获取"ab"在 "abkkcadkabkebfkabkskab" 中出现的次数*/

    public int getCount(String mainStr, String subStr) {
        if (mainStr.length() >= subStr.length()) {
            int count = 0;
            int index = 0;
/*             while((index = mainStr.indexOf(subStr)) != -1){
                  count++;
                  mainStr = mainStr.substring(index + subStr.length());
             }*/
            while ((index = mainStr.indexOf(subStr, index)) != -1) {//改进
                index += subStr.length();
                count++;
            }
            return count;
        } else {
            return 0;
        }
    }


    /*    题目4：获取两个字符串中最大相同子串。比如：
        str1 = "abcwerthelloyuiodef";
        str2 = "cvhellobnm"
        提示：将短的那个串进行长度依次递减的子串与较长的串比较。*/
    public String getMaxSameSubString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() > str2.length()) ? str1 : str2;
            String minStr = (str1.length() > str2.length()) ? str2 : str1;
            int len = minStr.length();
            for (int i = 0; i < len; i++) {//搜索的长度确认
                for (int x = 0, y = len - i; y <= len; x++, y++) {//(x,y)从左向右搜索
                    if (maxStr.contains(minStr.substring(x, y))) {
                        return minStr.substring(x, y);//返回同样的最小长度字符串
                    }


                }
            }
        }
        return null;
    }

    // 如果存在多个长度相同的最大相同子串
    // 此时先返回String[]，后面可以用集合中的ArrayList替换，较方便
//使用 stringBuffer可变数组


}