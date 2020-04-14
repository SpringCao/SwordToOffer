package 旋转数组中的最小数字;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        System.out.println(rotate(a));
    }
    private static int rotate(int[] a){
        int r = a.length - 1;
        int l = 0;
        while (l < r-1){
            int mid = (l + r) >> 1;
            if (a[l] <= a[mid]){
                l = mid;
            }else if (a[r] >= a[mid]){
                r = mid;
            }
        }
        return a[r];
    }
}
