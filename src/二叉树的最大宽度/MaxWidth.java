package 二叉树的最大宽度;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class MaxWidth {
    public static void main(String[] args) {
        Node head = new Node(8);

        head.left = new Node(6);

        head.left.left = new Node(5);

        head.left.right = new Node(7);

        head.right = new Node(10);

        head.right.left = new Node(9);

        head.right.right = new Node(11);
        System.out.println(max(head));
    }
    private static int max(Node root){
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int count = 1;
        int width = 1;
        while (!queue.isEmpty()){
            while (count-- > 0) {
                Node node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            count = queue.size();
            width = count > width ? count : width;
        }

        return width;
    }
}
