package 合并两个有序数组;

public class MergeTwoArrays {
    public static void main(String[] args) {

    }
    private static void merge(int[] nums1,int[] nums2){
        int len1 = nums1.length - 1;
        int len2 = nums2.length - 1;
        int l = nums1.length + nums2.length - 1;
        while (len1 >= 0 && len2 >= 0){
            nums1[l--] = nums1[len1] > nums2[len2] ? nums1[len1--]:nums2[len2--];
        }
        System.arraycopy(nums1,0,nums2,0,len2+1);
    }
}
