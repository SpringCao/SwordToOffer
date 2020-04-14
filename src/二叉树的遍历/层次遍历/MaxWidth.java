package 二叉树的遍历.层次遍历;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(8);

        head.left = new TreeNode(6);

        head.left.left = new TreeNode(5);

        head.left.right = new TreeNode(7);

        head.right = new TreeNode(10);

        head.right.left = new TreeNode(9);

        head.right.right = new TreeNode(11);

        System.out.println(maxWidth(head));
    }
    private static int maxWidth(TreeNode root){
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int width = 1;
        int count = 1;
        while (!queue.isEmpty()){
            while (count-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            count = queue.size();
            width = width > count ? width:count;
        }
        return width;
    }
}
