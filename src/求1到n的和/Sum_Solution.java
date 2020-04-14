package 求1到n的和;

//不能用到乘除
public class Sum_Solution {
    public static void main(String[] args) {
        System.out.println(Sum2(5));
    }

    //利用数列求和公式
    private static int Sum(int n){
        return ((int)Math.pow(n,2)+n) >> 1;
    }

    //利用递归
    private static int Sum2(int n){
        int sum = n;
        boolean flag = (n > 0) && (sum+=Sum2(n-1)) > 0;
        return sum;
    }
}
