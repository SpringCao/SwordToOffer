package 数组中重复的数字;

//对有序数组中的数字去重
public class DumplicateNumber {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,3};
        System.out.println(dumplicate(a));
    }
    private static int dumplicate(int[] a){
        int l = a.length;
        int j = 0;
        for (int i = 1; i < l; i++) {
            if (a[j] != a[i]){
                a[++j] = a[i];
            }
        }
        return j+1; //因为j代表的是索引而不是长度，所以这里要加一
    }
}
