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
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node1 = new BinaryTreeNode(2);
        BinaryTreeNode node2 = new BinaryTreeNode(3);
        root.left = node1;
        root.right = node2;
        mirrorRecursivelly(root);
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
