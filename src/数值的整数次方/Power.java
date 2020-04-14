package 数值的整数次方;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(2, -1));
    }
    private static double pow(double base,int e){
        double res = 1.0;
        for (int i = 1; i <= Math.abs(e); i++) {
            res *= base;
        }
        if (e < 0) res = 1 / res;
        return res;
    }
}
