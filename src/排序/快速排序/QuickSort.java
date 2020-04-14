package 排序.快速排序;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {3,8,7,1,4,5,2,9};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] arr,int begin,int end){
        if (begin > end) return;
        int i,j,t,temp;
        i = begin;
        j = end;
        temp = arr[begin];
        while (i < j){

            while (i < j && arr[j] <= temp) {
                j--;
            }
            while (i < j && arr[i] >= temp) {
                i++;
            }

            if (i < j){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[begin] = arr[j];
        arr[j] = temp;
        quickSort(arr,begin,j-1);
        quickSort(arr,j+1,end);
    }
}
