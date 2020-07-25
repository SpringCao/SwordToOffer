package 二叉树的遍历.先中后非递归遍历;

import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class Order {
    public static void main(String[] args) {
        Node head = new Node(8);

        head.left = new Node(6);

        head.left.left = new Node(5);

        head.left.right = new Node(7);

        head.right = new Node(10);

        head.right.left = new Node(9);

        head.right.right = new Node(11);

        inOrder(head);

    }
    private static void preOrder(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.val+" ");
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
    }

    private static void inOrder(Node root){
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || root != null){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()){
                root = stack.pop();
                System.out.print(root.val+" ");
                root = root.right;
            }
        }
    }

    private static void postOrder(Node node){
        Stack<Node> stack1 = new Stack<>(); //栈1存放节点
        Stack<Integer> stack2 = new Stack<>();  //栈2存放标志位
        while(node != null || !stack1.empty())
        {
            while (node != null)
            {
                stack1.push(node);
                stack2.push(0);
                node = node.left;
            }

            while(!stack1.empty() && stack2.peek() == 1)
            {
                stack2.pop();
                System.out.print(stack1.pop().val + "   ");
            }

            if(!stack1.empty())
            {
                stack2.pop();
                stack2.push(1);
                node = stack1.peek();
                node = node.right;
            }
        }
    }
}
