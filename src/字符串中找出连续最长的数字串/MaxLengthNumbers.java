package 字符串中找出连续最长的数字串;

import java.util.concurrent.locks.LockSupport;

public class MaxLengthNumbers {
    public static void main(String[] args) {
        String s = maxLength("abcd12345ed125ss123456789");
        System.out.println(s);
    }

    private static String maxLength(String s){
        int l = s.length();
        int count = 0;
        int max = 0;
        int end = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                count++;
                if (count > max){
                    max = count;
                    end = i;
                }
            }else {
                count = 0;
            }
        }
        String str = s.substring(end - max + 1,end+1);
        return str;
    }
}
