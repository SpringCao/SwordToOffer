package 斐波那契数列;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    private static int f(int n){
        if (n == 0 ) return 0;
        if (n == 1 || n ==2) return 1;
        int a = 1;
        int b = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = a+b;
            b = a;
            a = sum;
        }

        return sum;
    }
}
