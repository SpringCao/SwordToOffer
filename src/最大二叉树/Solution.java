package 最大二叉树;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class Solution {
    static int[] nums;
    private static TreeNode constructMaximumBinaryTree(int[] nums){
        return helper(0,nums.length);
    }
    private static TreeNode helper(int start,int end){
        if (start > end) return null;
        int max = nums[start];
        int index = start;
        for (int i = start+1; i < end; i++) {
            if (max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = helper(start,index);
        root.right = helper(index+1,end);
        return root;
    }
    public static void main(String[] args) {

    }
}
