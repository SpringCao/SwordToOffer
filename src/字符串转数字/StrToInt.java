package 字符串转数字;

public class StrToInt {
    public static void main(String[] args) {
        System.out.println(strToInt("-123456"));
    }
    private static int strToInt(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;
        int i = 0;
        while (i < n && chars[i] == ' ') {
            // 去掉前导空格
            i++;
        }
        if (i == n) {
            //去掉前导空格以后到了末尾了
            return 0;
        }
        boolean flag = false;
        if (chars[i] == '-'){
            flag = true;
            i++;
        }else if (chars[i] == '+'){
            i++;
        }else if (!Character.isDigit(chars[i])){
            return 0;
        }
        int res = 0;
        while (i < chars.length && Character.isDigit(chars[i])){
            int digit = chars[i] - '0';
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                // 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
                // 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
                return flag? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + digit;
            i++;
        }
        return flag == true? -res:res;
    }

}
