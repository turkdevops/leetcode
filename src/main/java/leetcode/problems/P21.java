package leetcode.problems;

import leetcode.datastructure.list.singly.ListNode;

public class P21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode head = null;
        ListNode prev = null;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                if (head == null) {
                    prev = head = p1;
                }
                else {
                    prev.next = p1;
                    prev = prev.next;
                }

                p1 = p1.next;
            }
            else {
                if (head == null) {
                    prev = head = p2;
                }
                else {
                    prev.next = p2;
                    prev = prev.next;
                }

                p2 = p2.next;
            }
        }

        if (p1 != null) {
            prev.next = p1;
        }

        if (p2 != null) {
            prev.next = p2;
        }

        return head;
    }
}
