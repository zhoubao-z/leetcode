package record_202109;

/**
 * 分隔链表
 * https://leetcode-cn.com/problems/split-linked-list-in-parts/
 */

public class _0922_splitListToParts {
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode p=head;
        int len=0;
        while(p!=null){
            len++;
            p=p.next;
        }
        int interval=len/k;
        ListNode[] listNodes=new ListNode[k];
        listNodes[0]=head;
        for(int i=1;i<k;i++){
            listNodes[i]=listNodes[i-1];
            for(int j=0;j<interval;j++){
                listNodes[i]=listNodes[i].next;
            }
            if(i<len%k+1){
                listNodes[i]=listNodes[i].next;
            }
        }
        for(int i=0;i<k-1;i++){
            p=listNodes[i];
            if(p==null) break;
            while(p.next!=listNodes[i+1]){
                p=p.next;
            }
            p.next=null;
        }
        return listNodes;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        ListNode head=ListNode.getLinkedList(nums);

        ListNode[] listNodes=splitListToParts(head,5);
        for(ListNode node:listNodes){
            while(node!=null){
                System.out.print(node.val+",");
                node=node.next;
            }
            System.out.println();
        }
    }
}


