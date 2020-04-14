package 二叉树的左右视图;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class LeftSideView {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(8);

        head.left = new TreeNode(6);

        head.left.left = new TreeNode(5);

        head.left.right = new TreeNode(7);

        head.right = new TreeNode(10);

        head.right.left = new TreeNode(9);

        head.right.right = new TreeNode(11);

        left(head);
    }
    private static void left(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size;
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                //if (i == 0) System.out.println(node.val);
                if (i == size - 1) System.out.println(node.val);   //右视图
            }
        }
    }
}
