package 链表中倒数第k个节点;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ReverKNode {
    public static void main(String[] args) {

    }
    private static Node KToTail(Node head,int k){
        Node p = head;
        Node q = head;
        for (int i = 1; i < k; i++) {
            if (q.next != null){
                q = q.next;
            }else{
                throw new RuntimeException("不够k个节点");
            }
        }
        while(q.next != null){
            q = q.next;
            p = p.next;
        }
        return p;
    }
}
