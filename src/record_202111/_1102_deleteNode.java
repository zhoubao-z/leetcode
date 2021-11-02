package record_202111;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 237. 删除链表中的节点
 */
public class _1102_deleteNode {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

    public static void main(String[] args) {

    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
