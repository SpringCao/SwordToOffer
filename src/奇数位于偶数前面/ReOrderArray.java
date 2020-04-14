package 奇数位于偶数前面;

import java.util.ArrayList;
import java.util.Arrays;

public class ReOrderArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        reOrder(a);
        System.out.println(Arrays.toString(a));
    }
    private static void reOrder(int[] a){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1){
                list1.add(a[i]);
            }
            if (a[i] % 2 == 0){
                list2.add(a[i]);
            }
        }
        int index = 0;
        for (Integer x:
             list1) {
            a[index++] = x;
        }
        for (Integer x:
                list2) {
            a[index++] = x;
        }
    }
}
