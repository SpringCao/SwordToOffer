package 丑数;

/**
 * 题目：我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求从小到大的顺序的第 1500个丑数。
 * 例如 6、8 都是丑数，但 14 不是，它包含因子 7。习惯上我们把 1 当做第一个丑数。
 *
 * 【解】：用空间换时间
 * 假设当前已经求到了第M个UglyNumber
 * 则第M+1个丑数一定是前面的某个数字 *2、*3、*5的最小值！
 * 是谁，谁对应的指针++，
 * 其他的指针也要跟进到 *2、*3、*5之后的值<=UglyNumber[M+1]!!
 *
 *
 * Created by nibnait on 2016/10/1.
 */
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(ugly(6));
    }
    private static int ugly(int n){
        int[] dp = new int[n];
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(dp[p2]*2,dp[p3]*3),dp[p5]*5);
            if (dp[i] == dp[p2]*2){
                p2++;
            }
            if (dp[i] == dp[p3]*2){
                p3++;
            }
            if (dp[i] == dp[p5]*2){
                p5++;
            }
        }
        return dp[n-1];
    }
}
