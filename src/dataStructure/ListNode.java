package dataStructure;

import java.util.List;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(){

    }
    public ListNode(int x) {
        this.val = x;
    }
    public ListNode(int x,ListNode next){
        this.val=x;
        this.next=next;
    }
    public  ListNode getLinkedList(int[] nums){
        if(nums==null||nums.length==0){
            return new ListNode();
        }
        ListNode head=new ListNode(nums[0]);
        ListNode p=head;
        for(int i=1;i<nums.length;i++){
            p.next=new ListNode(nums[i]);
            p=p.next;
        }
        return head;

    }
}
