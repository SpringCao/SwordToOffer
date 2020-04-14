package Z字二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTreeNode{
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int val){
        this.value = val;
    }
}
public class ZBinaryTree {
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
        List<List<Integer>> res = new LinkedList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        if (root == null) return null;
        queue.add(root);
        int count = 1;
        int num = 1;   //记录当前是第几层
        while (!queue.isEmpty()){
            List<Integer> list = new LinkedList<>();
            while (count-- > 0) {
                BinaryTreeNode now = queue.poll();
                list.add(now.value);
                if (now.left != null) {
                    queue.add(now.left);
                }
                if (now.right != null) {
                    queue.add(now.right);
                }
            }
            if (num % 2 == 0){
                int i = 0;
                int j = list.size()-1;
                while (i < j){
                    Integer t = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,t);
                    i++;
                    j--;
                }
            }
            num++;
            count = queue.size();
            res.add(list);
        }
        return res;
    }
}
