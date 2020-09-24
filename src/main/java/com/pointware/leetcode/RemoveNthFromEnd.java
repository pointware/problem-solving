package com.pointware.leetcode;

import com.pointware.leetcode.util.ListNode;

public class RemoveNthFromEnd implements com.pointware.leetcode.problem.RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        var tempHead = new ListNode();
        tempHead.next = head;

        var p1 = tempHead;
        var p2 = head;

        int gap = 0;
        while (p2 != null) {
            if (gap < n) {
                gap++;
            } else {
                p1 = p1.next;
            }
            p2 = p2.next;
        }

        if (tempHead == p1) {
            return p1.next.next;
        } else {
            p1.next = p1.next.next;
        }

        return head;
    }
}
