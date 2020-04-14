package 把数组排成最小的数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MinNumber {
    public static void main(String[] args) {
        int[] a = {3,32,321};
        System.out.println(min(a));
    }
    private static String min(int[] a){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]+"");
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s:
             list) {
            sb.append(s);
        }
        return sb.toString();
    }
}
