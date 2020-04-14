package 排序.快速排序;

import java.util.Arrays;

public class KMax {
    public static void main(String[] args) {
        int[] a = {3,8,7,1,4,5,2,9};
        int b = quickSort(a,0,a.length-1,3);
        System.out.println(b);
    }
    private static int quickSort(int[] arr,int low,int high,int k){
        if (low > high) return -1;
        int i = low;
        int j = high;
        int temp = arr[low];
        while (i < j){
            while (i < j && arr[j] <= temp) j--;
            while (i < j && arr[i] >= temp) i++;
            if (i < j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }

        }
        arr[low] = arr[i];
        arr[i] = temp;
        if (i > k-1){
            return quickSort(arr,low,j-1,k);
        }else if(i < k-1){
            return quickSort(arr,j+1,high,k);
        }
        return arr[i];
    }

}
