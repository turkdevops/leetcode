package leetcode.datastructure.list.singly;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode of(int[] values) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode prev = head;

        for (int i = 1; i < values.length; ++i) {
            prev.next = new ListNode(values[i]);
            prev = prev.next;
        }

        return head;
    }

    public static int[] convert(ListNode head) {
        if (head == null) return null;

        List<Integer> values = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        return values.stream().mapToInt(v -> v).toArray();
    }
}
