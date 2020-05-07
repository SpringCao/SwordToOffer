package 二叉树的最大路径和;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class MaxPath {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    private int helper(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(helper(root.left),0);
        int right = Math.max(helper(root.right),0);
        max = Math.max(left+right+root.val,max);
        return Math.max(left,right)+root.val;
    }
}
