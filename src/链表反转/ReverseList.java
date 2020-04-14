package 链表反转;

import java.util.List;

class ListNode{
    int value;
    ListNode next;
    public ListNode(int value){
        this.value = value;
    }
}
public class ReverseList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = reverseList(node1);
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    private static ListNode reverseList(ListNode node){
        ListNode pre = null;
        ListNode now = node;
        while (now != null){
            ListNode temp = now.next;
            now.next = pre;
            pre = now;
            now = temp;
        }
        return pre;
    }
}
