package 有序数组中数的正确位置;

public class RightPosition {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,7};
        System.out.println(position(a, 0));
    }
    private static int position(int[] a,int number){
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                return i;
            }else if (number > a[i]){
                k++;
            }

        }
        return k;
    }
}
