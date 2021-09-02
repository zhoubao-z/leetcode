package record_202109;
/**
 * 链表中倒数第k个节点
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */

import dataStructure.ListNode;

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
