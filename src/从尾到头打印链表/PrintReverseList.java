package 从尾到头打印链表;


import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        val = this.val;
    }
}
public class PrintReverseList {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node now = head;
        for (int i = 1; i < 10; i++) {
            Node x = new Node(i);
            x.next = null;
            now.next = x;
            now = x;
        }
        System.out.println(print(head));
    }
    private static ArrayList<Integer> print(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (node != null){
            stack.push(node.val);
            node = node.next;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
