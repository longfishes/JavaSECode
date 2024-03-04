package com.longfish.lc.month12;

import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class exer15 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        ListNode l = l1;
        while (l != null) {
            n1.append(l.val);
            l = l.next;
        }

        l = l2;
        while (l != null) {
            n2.append(l.val);
            l = l.next;
        }

        n1.reverse();
        n2.reverse();
        BigInteger b1 = new BigInteger(n1.toString());
        BigInteger b2 = new BigInteger(n2.toString());
        BigInteger b = b1.add(b2);

        String s = b.toString();

        ListNode ansList = new ListNode();
        l = ansList;
        for (int i = s.length() - 1; i >= 0; i--) {
            l.next = new ListNode(Integer.parseInt(s.charAt(i) + ""));
            l = l.next;
        }

        return ansList.next;
    }
}
