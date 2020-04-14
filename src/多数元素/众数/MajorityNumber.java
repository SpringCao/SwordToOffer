package 多数元素.众数;

//数组中超过n/2的数
public class MajorityNumber {
    public static void main(String[] args) {
        int[] a = {2,3,3,3,3,4,5};
        System.out.println(major(a));
    }
    private static int major(int[] a){
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < a.length; i++) {
            if (count == 0){
                candidate = a[i];
            }
            count += (candidate == a[i])?1:-1;
        }
        return candidate;
    }
}
