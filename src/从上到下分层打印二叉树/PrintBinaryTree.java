package 从上到下分层打印二叉树;

import java.util.*;

class BinaryTreeNode{
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int val){
        this.value = val;
    }
}
public class PrintBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode head = new BinaryTreeNode(8);

        head.left = new BinaryTreeNode(6);

        head.left.left = new BinaryTreeNode(5);

        head.left.right = new BinaryTreeNode(7);

        head.right = new BinaryTreeNode(10);

        head.right.left = new BinaryTreeNode(9);

        head.right.right = new BinaryTreeNode(11);

        List<List<Integer>> a = print(head);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    private static List<List<Integer>> print(BinaryTreeNode root){
        if (root == null) return null;
        List<List<Integer>> res = new ArrayList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 1;   //用来统计每一层节点的个数
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            //int temp = 0;   //用来保存下一次节点的个数
            while (count-- > 0) {
                BinaryTreeNode now = queue.poll();
                list.add(now.value);
                if (now.left != null) {
                    //temp++;
                    queue.offer(now.left);
                }
                if (now.right != null) {
                    //temp++;
                    queue.offer(now.right);
                }
            }
            res.add(list);
            count = queue.size();
        }
        return res;
    }
}
