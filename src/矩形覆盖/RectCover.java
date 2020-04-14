package 矩形覆盖;

//用2x1的矩形去横着放或者竖着放去覆盖更大的矩形，用n个2x1的矩形去覆盖一个2xn的大矩形，总共多少种方法
//跟跳台阶一个问题
public class RectCover {
    public static void main(String[] args) {

    }
    private static int cover(int n){
        if (n == 1 || n == 2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
