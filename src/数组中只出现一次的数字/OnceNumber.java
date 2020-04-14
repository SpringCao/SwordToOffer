package 数组中只出现一次的数字;

//数组中只有一个数字出现了一次，其他都出现了两次
public class OnceNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,2,1,5};
        System.out.println(once(a));
    }
    private static int once(int[] a){
        if (a.length == 0) return -1;
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res = a[i]^res;
        }
        return res;
    }
}
