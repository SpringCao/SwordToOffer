package 二进制中1的个数;

public class NumberOf1 {
    public static void main(String[] args) {
        System.out.println(number(-1));
    }
    private static int number(int n){
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            sum = sum + (n & 1);
            n = (n >> 1);
        }
        return sum;
    }
}
