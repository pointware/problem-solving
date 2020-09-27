package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode142;
import com.pointware.leetcode.util.ListNode;

public class LeetCode142Impl implements LeetCode142 {
    @Override
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        var nHead = new ListNode();
        nHead.next = head;
        var slow = nHead;
        var fast = nHead;

        do {
            if (slow == null || fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        fast = nHead;

        do {
            slow = slow.next;
            fast = fast.next;
        } while (slow != fast);

        return slow;
    }
}
