package 回文数字;

public class IsReverse {
    public static void main(String[] args) {
        boolean flag = isReverse(1);
        System.out.println(flag);
    }
    private static boolean isReverse(int i){
        int j = i;
        int sum = 0;
        int k;
        while (i != 0){
            k = i % 10;
            sum = sum * 10 + k;
            i = i / 10;
        }
        return sum == j;
    }
}
