package 另一个树的子树;

/**
  给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
  s 的一个子树包括 s 的一个节点和这个节点的所有子孙。
  s 也可以看做它自身的一棵子树。
**/

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class SubTree {
    private static boolean isSubTree(TreeNode s,TreeNode t){
        if (s == null) return true;
        if (t == null) return false;
        return isSubTree(s.left,t) || isSubTree(s.right,t) || isSameTree(s,t);
    }

    //判断两棵树是否相同
    private static boolean isSameTree(TreeNode s,TreeNode t){
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
    }
    public static void main(String[] args) {

    }
}
