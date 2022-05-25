package leetcode_hot100;

import java.util.List;

public class _02两数相加 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode result = new ListNode();
        ListNode p = result;
        while (l1 != null && l2 != null) {
            sum = carry + l1.val + l2.val;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            sum = carry + l1.val ;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
            l1 = l1.next;
        }
        while(l2!=null){
            sum = carry + l2.val ;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
            l2 = l2.next;
        }
        if(carry!=0){
            p.next=new ListNode(carry);
            p=p.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(9);
        l1.next=new ListNode(9);
        l1.next.next=new ListNode(9);
        ListNode l2=new ListNode(9);
        addTwoNumbers(l1,l2);
    }
}
