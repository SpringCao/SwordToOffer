package 最长公共前缀;

public class LongestCommonPrefix {
    private static String longestCommonPrefix(String[] strs){
        if (strs.length == 0) return null;
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < res.length() && j < strs[i].length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            res = res.substring(0,j);
        }
        return res;
    }
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
