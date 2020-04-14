package 空格替换;

import java.util.Scanner;

public class ReplaceSpace {
    public static void main(String[] args) {
        //String s = "we are happy";
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(scanner.nextLine());
        System.out.println(replace(sb));
    }
    private static String replace(StringBuffer s){
        int l = s.length();
        String r = "20%";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == ' '){
                stringBuffer.append(r);
            }else {
                stringBuffer.append(s.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
