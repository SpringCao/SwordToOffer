package 整数翻转;

public class Reverse {
    private static int reverse(int x){
        int res = 0;
        while (x != 0){
            int r = x % 10;
            int temp = r + res * 10;
            //判断数据是否溢出
            if ((temp - r) % 10 != res){
                return 0;
            }
            res = temp;
            x = x / 10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-31));
    }
}
