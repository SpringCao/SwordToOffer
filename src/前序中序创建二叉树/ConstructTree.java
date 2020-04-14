package 前序中序创建二叉树;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class ConstructTree {
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in  = {4,7,2,1,5,3,8,6};
        TreeNode root = construct(pre,in);
    }
    private static TreeNode construct(int[] pre,int[] in){

        return null;
    }
}
