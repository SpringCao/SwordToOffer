package 买股票的最佳时机;

public class MaxProfit2 {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(max(a));
    }
    private static int max(int[] a){
        int i = 0;
        int j = 1;
        int max = 0;
        while (j < a.length){
            while (j < a.length && a[j] < a[i]){
                if (a[i] - a[j] > max){
                    max = a[i] - a[j];
                }
                j++;
            }
            i = j;
            j++;
        }
        return max;

    }

}
