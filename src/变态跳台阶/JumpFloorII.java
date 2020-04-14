package 变态跳台阶;

public class JumpFloorII {
    public static void main(String[] args) {
        System.out.println(jump(4));
    }
    private static int jump(int n){
        if (n == 1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = sum + 1;
            sum = sum + dp[i];

        }
        return dp[n];
    }
}
