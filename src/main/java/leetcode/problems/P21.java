package leetcode.problems;

import leetcode.datastructure.list.singly.ListNode;

public class P21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(0);
        ListNode prev = sentinel;

        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                prev.next = p1;
                p1 = p1.next;
            }
            else {
                prev.next = p2;
                p2 = p2.next;
            }

            prev = prev.next;
        }

        if (p1 != null) {
            prev.next = p1;
        }

        if (p2 != null) {
            prev.next = p2;
        }

        return sentinel.next;
    }
}
