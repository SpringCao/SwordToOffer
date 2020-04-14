package 平衡二叉树;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class BalancedTree {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(8);

        head.left = new TreeNode(6);

        head.left.left = new TreeNode(5);

        head.left.right = new TreeNode(7);

//        head.right = new TreeNode(10);

//        head.right.left = new TreeNode(9);
//
//        head.right.right = new TreeNode(11);

        System.out.println(isBalance(head));
    }
    private static int depth(TreeNode root){
        if (root == null) return 0;
        return depth(root.left) > depth(root.right)?depth(root.left)+1:depth(root.right)+1;
    }
    private static boolean isBalance(TreeNode root){
        if (root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right))<=1 && isBalance(root.left) && isBalance(root.right);
    }
}
