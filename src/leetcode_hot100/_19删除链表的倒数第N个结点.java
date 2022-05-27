package leetcode_hot100;

public class _19删除链表的倒数第N个结点 {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=new ListNode(-1,head);
        ListNode node1=p;
        ListNode node2=p;
        for(int i=0;i<=n;i++){
            node1=node1.next;
        }
        while(node1!=null){
            node1=node1.next;
            node2=node2.next;
        }
        node2.next=node2.next.next;
        return p.next;
    }
}
