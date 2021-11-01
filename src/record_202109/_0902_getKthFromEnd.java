package record_202109;
/**
 * 链表中倒数第k个节点
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */


public class _0902_getKthFromEnd {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if(k<=0){
            return new ListNode();
        }
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<k&&fast!=null;i++){
            fast=fast.next;
        }
        while(fast!=null&&slow!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
       ListNode head= ListNode.getLinkedList(nums);
        System.out.println(getKthFromEnd(head,4).val);
    }
}
 class ListNode {

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
    public static ListNode getLinkedList(int[] nums){
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
