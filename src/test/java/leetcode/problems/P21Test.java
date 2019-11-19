package leetcode.problems;

import leetcode.datastructure.list.singly.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P21Test {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = ListNode.of(new int[] {-9, 3});
        ListNode l2 = ListNode.of(new int[] {5, 7});

        ListNode lm = new P21().mergeTwoLists(l1, l2);
        Assert.assertArrayEquals(new int[]{-9, 3, 5, 7}, ListNode.convert(lm));
    }
}