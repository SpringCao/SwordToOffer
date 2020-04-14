package 找出数组中重复的数字;

public class ReNumber {
    public static void main(String[] args) {
        int[] a = {2,3,5,4,3,2,6,7};
        System.out.println(ree(a));
    }
    private static int ree(int[] arr){
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            while (arr[i] != i){
                if (arr[arr[i]] == arr[i]){
                    return arr[i];
                } else {
                    int temp = arr[i];
                    arr[i] = arr[arr[i]];
                    arr[arr[i]] = temp;
                }
            }
        }
        return -1;
    }
}
