package record_202109;

/**
 * 扁平化多级双向链表
 * https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list/
 *
 */
public class _0924_flatten {
    public Node flatten(Node head) {
       dfs(head);
        return head;
    }

    private Node dfs(Node node) {
        Node cur=node;
        Node last=null;
        while(cur!=null){
            Node next=cur.next;
            if(cur.child!=null){
                Node childLast=dfs(cur.child);
                next=cur.next;
                cur.next=cur.child;
                cur.child.prev=cur;
                if(next!=null){
                    childLast.next=next;
                    next.prev=childLast;
                }
                cur.child=null;
                last=childLast;
            }else{
                last=cur;
            }
            cur=next;
        }
        return last;
    }

    public static void main(String[] args) {

    }
}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
