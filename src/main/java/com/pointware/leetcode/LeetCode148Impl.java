package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode148;
import com.pointware.leetcode.util.ListNode;

public class LeetCode148Impl implements LeetCode148 {
    @Override
    public ListNode sortList(ListNode head) {
        //o(nlogn) -> heap? merge?
        //o(1)
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        var node1 = sortList(head);
        var node2 = sortList(slow);

        return merge(node1, node2);
    }

    public ListNode merge(ListNode source, ListNode target) {
        if (source == null) return target;
        if (target == null) return source;

        ListNode head = new ListNode();
        ListNode sNode = source;
        ListNode tNode = target;
        ListNode rNode = head;

        while (sNode != null && tNode != null) {
            if (sNode.val < tNode.val) {
                rNode.next = sNode;
                sNode = sNode.next;
            } else {
                rNode.next = tNode;
                tNode = tNode.next;
            }
            rNode = rNode.next;
        }
        if (sNode != null) {
            rNode.next = sNode;
        }
        if (tNode != null) {
            rNode.next = tNode;
        }

        return head.next;
    }
}
