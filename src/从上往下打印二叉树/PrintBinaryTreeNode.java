package 从上往下打印二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode{
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int val){
        this.value = val;
    }
}
public class PrintBinaryTreeNode {
    public static void main(String[] args) {
        BinaryTreeNode head = new BinaryTreeNode(8);

        head.left = new BinaryTreeNode(6);

        head.left.left = new BinaryTreeNode(5);

        head.left.right = new BinaryTreeNode(7);

        head.right = new BinaryTreeNode(10);

        head.right.left = new BinaryTreeNode(9);

        head.right.right = new BinaryTreeNode(11);

        int[] a = print(head);
        System.out.println(Arrays.toString(a));

    }
    private static int[] print(BinaryTreeNode root){
        if (root == null) return null;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTreeNode now = queue.poll();
            list.add(now.value);
            if (now.left != null){
                queue.offer(now.left);
            }
            if (now.right != null){
                queue.offer(now.right);
            }
        }
        int[] a = new int[list.size()];
        int index = 0;
        for (Integer i:
             list) {
            a[index++] = i;
        }
        return a;
    }
}
