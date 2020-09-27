package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode328;
import com.pointware.leetcode.util.ListNode;

public class LeetCode328Impl implements LeetCode328 {
    @Override
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode evenHead = head.next;
        ListNode evenNext = evenHead;
        ListNode oddNext = head;

        while (oddNext != null && evenNext != null && evenNext.next != null) {
            oddNext.next = oddNext.next.next;
            oddNext = oddNext.next;
            evenNext.next = evenNext.next.next;
            evenNext = evenNext.next;
        }

        oddNext.next = evenHead;
        return head;
    }
}
