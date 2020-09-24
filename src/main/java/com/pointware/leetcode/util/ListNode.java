package com.pointware.leetcode.util;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fromArray(int[] val) {
        if(val.length == 0) return null;
        var head = new ListNode(val[0]);
        var node = head;
        for (int i = 1; i < val.length; i++) {
            var next = new ListNode(val[i]);
            node.next = next;
            node = next;
        }
        return head;
    }

    public List<Integer> toList(){
        if(this.next == null){
            var list = new ArrayList<Integer>();
            list.add(val);
            return list;
        } else {
            var list = this.next.toList();
            list.add(0, val);
            return list;
        }
    }
}
