package com.longfish.lc.month12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exer2 {


    public class ListNode {
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

    public ListNode reverseList(ListNode head) {

        if (head == null) return null;
        if (head.next == null) return new ListNode(head.val);

        List<Integer> list = new ArrayList<>();

        list.add(head.val);
        ListNode node = head;
        while (true){
            node = node.next;

            if (node == null) break;
            list.add(node.val);
        }

        Collections.reverse(list);

        ListNode[] nodes = new ListNode[list.size()];
        nodes[0] = new ListNode(list.get(0));

        for (int i = 1; i < list.size() - 1; i++) {
            nodes[i] = new ListNode(list.get(i));

            nodes[i - 1].next = nodes[i];
        }
        nodes[list.size() - 1] = new ListNode(list.get(list.size() - 1));

        nodes[list.size() - 2].next = nodes[list.size() - 1];



        return nodes[0];

    }





}
