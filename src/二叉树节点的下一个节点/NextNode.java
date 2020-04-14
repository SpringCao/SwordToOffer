package 二叉树节点的下一个节点;

class Node{
    int value;
    Node left;
    Node right;
    Node next;
    Node(int value){
        this.value = value;
    }
}
public class NextNode {
    public static void main(String[] args) {

    }
    private static Node next(Node node){
        if (node.right != null){
            node = node.right;
            while (node.left != null){
                node = node.left;
            }
            return node;
        }else {
            Node father = node.next;
            if (father.left == node){
                return father;
            }else {
                return father.next;
            }
        }
    }
}
