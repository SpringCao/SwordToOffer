package 滑动窗口的最大值;

import java.util.ArrayList;

public class WindowMax {
    public static void main(String[] args) {
        int[] a = {2,3,4,2,6,2,5,1};
        System.out.println(max(a, 3).toString());
    }
    private static ArrayList<Integer> max(int[] a,int size){
        ArrayList<Integer> list = new ArrayList<>();
        if (a.length == 0) return null;
        for (int i = size-1; i < a.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i-size+1; j <= i; j++) {
                if (a[j] > max){
                    max = a[j];
                }
            }
            list.add(max);
        }
        return list;
    }
}
