package 删除链表中某一个节点;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class DeleteNode {
    public static void main(String[] args) {
        Node head = new Node(-1);
        Node node1 = new Node(2);
        Node node2 = new Node(5);
        Node node3 = new Node(8);
        Node node4 = new Node(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        deleteNode2(head,5);
        Node p = head;
        while (p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }

    //缺点就是删除尾结点时会有空指针异常
    private static void delete(Node head,int val){
        Node p = head;
        while (p.val != val){
            p = p.next;
        }
        deleteNode(p);
    }
    private static void deleteNode(Node node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private static Node deleteNode2(Node head,int val){
        Node pre = new Node(-1);
        pre.next = head;
        Node p = pre;
        Node q = head;
        while (q != null){
            if (q.val == val){
                p.next = q.next;
                q = q.next;
            }else {
                pre = q;
                q = q.next;
            }
        }
        return pre.next;
    }
}
