package 二叉树的镜像;

class BinaryTreeNode{
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int val){
        this.value = val;
    }
}
public class MirrorBinaryTree {
    public static void main(String[] args) {

    }
    private static void mirrorRecursivelly(BinaryTreeNode head) {
        if (head == null) return;
        if (head.left == null && head.right == null) return;
        BinaryTreeNode temp = head.left;
        head.left = head.right;
        head.right = temp;
        mirrorRecursivelly(head.left);
        mirrorRecursivelly(head.right);
    }
}
