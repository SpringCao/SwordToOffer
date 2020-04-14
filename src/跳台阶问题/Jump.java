package 跳台阶问题;

public class Jump {
    public static void main(String[] args) {
        System.out.println(jump(5));
    }
    private static int jump(int n){
        if (n >= 0 && n <= 2) return n;
        int a = 2;
        int b = 1;
        int sum = 0;
        for (int i = 3; i <= n ; i++) {
            sum = a + b;
            b = a;
            a = sum;
        }
        return sum;
    }
}
