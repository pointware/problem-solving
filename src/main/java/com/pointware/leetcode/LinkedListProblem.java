package com.pointware.leetcode;

import com.pointware.leetcode.util.ListNode;

public class LinkedListProblem {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        var oddHead = head;
        var evenHead = head.next;
        var odd = oddHead;
        var even = evenHead;
        var node = head.next.next;
        while(node != null){
            odd.next = node;
            odd = odd.next;
            if(node.next != null){
                even.next = node.next;
                even = even.next;
            }else{
                break;
            }
            node = node.next.next;
        }
        even.next = null;
        odd.next = evenHead;
        return oddHead;
    }
}
