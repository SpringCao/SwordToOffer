package 二叉搜索树的第K大的节点;

import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class KthLargest {
    public static void main(String[] args) {

    }
    private static int kLargest(Node root,int k){
        int count = 1;
        Stack<Node> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while (root.right != null){
                stack.push(root.right);
                root = root.right;
            }
            Node pop = stack.pop();
            if (count == k){
                return pop.val;
            }
            count++;
            root = pop.left;
        }
        return 0;
    }
}
