package leetcode.problems;

import leetcode.datastructure.list.singly.ListNode;

public class P160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        int lenA = length(headA);
        int lenB = length(headB);

        ListNode la = forward(headA, lenA - lenB);
        ListNode lb = forward(headB, lenB - lenA);

        while (la != null && lb != null) {
            if (la == lb) return la;
            la = la.next;
            lb = lb.next;
        }

        return null;
    }

    private int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }

        return len;
    }

    private ListNode forward(ListNode head, int step) {
        ListNode node = head;
        while (step > 0) {
            step--;
            node = node.next;
        }

        return node;
    }
}
