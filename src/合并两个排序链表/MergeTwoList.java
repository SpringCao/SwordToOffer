package 合并两个排序链表;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class MergeTwoList {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(5);
        head2.next.next.next = new ListNode(6);
        head2.next.next.next.next = new ListNode(7);

        ListNode head1 = merge(head,head2);
        while (head1 != null) {
            System.out.println(head1.val);
            head1 = head1.next;
        }
    }
    private static ListNode merge(ListNode h1,ListNode h2){
        if (h1 == null) return h2;
        if (h2 == null) return h1;
        ListNode temp = null;
        if (h1.val <= h2.val){
            temp = h1;
            temp.next = merge(h1.next,h2);
        }else{
            temp = h2;
            temp.next = merge(h1,h2.next);
        }
        return temp;
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}
