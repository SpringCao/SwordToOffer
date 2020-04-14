package 连续子序列的最大和;

public class MaxSumArray {
    public static void main(String[] args) {
        int[] a = {6,-3,-2,7,-15,1,2,2};
        System.out.println(max(a));
    }
    private static int max(int[] a){
        int l = a.length;
        int[] dp = new int[l];
        dp[0] = a[0];
        int max = dp[0];
        for (int i = 1; i < l; i++) {
            if (dp[i-1] + a[i] < 0){
                dp[i] = 0;
            }else {
                dp[i] = dp[i-1]+a[i];
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
