package leetcode_hot100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _23合并K个升序链表 {
    class ListNode {
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        p.next = l1 != null ? l1 : l2;
        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 0) {
            return null;
        } else if (n == 1) {
            return lists[0];
        } else if (n == 2) {
            return mergeTwoLists(lists[0],lists[1]);
        } else {
            ListNode[] left = new ListNode[n / 2];
            ListNode[] right = new ListNode[n - n / 2];
            for (int i = 0; i < n / 2; i++) {
                left[i] = lists[i];
            }
            for (int i=0;i<n-n/2;i++){
                right[i]=lists[n/2+i];
            }
           return  mergeTwoLists(mergeKLists(left),mergeKLists(right));
        }
    }
}
