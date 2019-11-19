package leetcode.problems;

import leetcode.datastructure.list.singly.ListNode;

public class P206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        ListNode subHead = reverseList(next);

        next.next = head;
        head.next = null;

        return subHead;
    }
}
