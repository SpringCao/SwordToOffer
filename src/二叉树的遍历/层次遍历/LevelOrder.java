package 二叉树的遍历.层次遍历;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class LevelOrder {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(8);

        head.left = new TreeNode(6);

        head.left.left = new TreeNode(5);

        head.left.right = new TreeNode(7);

        head.right = new TreeNode(10);

        head.right.left = new TreeNode(9);

        head.right.right = new TreeNode(11);

        level(head);
    }
    private static void level(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }

    }
}
