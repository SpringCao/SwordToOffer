package SecondExercise.二叉树.遍历二叉树;

import java.util.Stack;

class BinaryTreeNode{
    BinaryTreeNode left;
    BinaryTreeNode right;
    int val;
    BinaryTreeNode(int val){
        this.val = val;
    }
}
class TagNode{
    BinaryTreeNode binaryTreeNode;
    boolean isFirst;
}
public class Order {
    public static void main(String[] args) {
        BinaryTreeNode head = new BinaryTreeNode(8);

        head.left = new BinaryTreeNode(6);

        head.left.left = new BinaryTreeNode(5);

        head.left.right = new BinaryTreeNode(7);

        head.right = new BinaryTreeNode(10);

        head.right.left = new BinaryTreeNode(9);

        head.right.right = new BinaryTreeNode(11);

        postOrder(head);
    }

    private static void preOrder(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;
        while (!stack.isEmpty() || node != null){
            while (node != null){
                System.out.println(node.val);
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()){
                node = stack.pop();
                node = node.right;
            }
        }
    }

    private static void inOrder(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;
        while (!stack.isEmpty() || node != null){
            while (node != null){
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()){
                node = stack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }

    private static void postOrder(BinaryTreeNode node){
        Stack<TagNode> stack = new Stack<>();
        TagNode tagNode;
        while (node != null || !stack.isEmpty()){
            while (node != null){
                tagNode = new TagNode();
                tagNode.binaryTreeNode = node;
                tagNode.isFirst = true;
                stack.push(tagNode);
                node = node.left;
            }
            if (!stack.isEmpty()){
                tagNode = stack.pop();
                if (tagNode.isFirst == true){
                    tagNode.isFirst = false;
                    stack.push(tagNode);
                    node = tagNode.binaryTreeNode.right;
                }else {
                    System.out.println(tagNode.binaryTreeNode.val);
                    node = null;
                }
            }
        }
    }
}
