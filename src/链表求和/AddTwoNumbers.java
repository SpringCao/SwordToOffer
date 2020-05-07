package 链表求和;

import java.util.HashSet;
import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class AddTwoNumbers {
    public static void main(String[] args) {
        HashSet set = new HashSet();
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p1 = l1, p2 = l2, result = new ListNode(0);
        ListNode p = result;
        int carr = 0;

        while(p1 != null || p2 != null || carr > 0)
        {
            int sum = carr;
            sum += p1 == null ? 0 : p1.val;
            sum += p2 == null ? 0 : p2.val;

            p.next = new ListNode(sum % 10);
            p = p.next;

            carr = sum / 10;

            if(p1 != null)
                p1 = p1.next;
            if(p2 != null)
                p2 = p2.next;
        }

        return result.next;

    }
}
