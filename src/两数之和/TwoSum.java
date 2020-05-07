package 两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] twoSum(int[] a,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int j = target - a[i];
            if (map.containsKey(j)){
                return new int[]{map.get(j),i};
            }
            map.put(a[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] a = {1,4,6,8,3};
        int[] b = twoSum(a,14);
        System.out.println(Arrays.toString(b));
    }
}
