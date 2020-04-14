package 链表相交的第一个节点;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class FirstNode {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Node node6 = new Node(7);
        node6.next = node3;
        System.out.println(firstNode(node, node6).val);
    }
    private static Node firstNode(Node headA,Node headB){
        if (headA == null || headB == null) return null;
        Node pA = headA;
        Node pB = headB;
        while (pA != pB){
            pA = pA == null?headB:pA.next;
            pB = pB == null?headA:pB.next;
        }
        return pA;
    }
}
