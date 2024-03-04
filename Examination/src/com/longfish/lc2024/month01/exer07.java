package com.longfish.lc2024.month01;

public class exer07 {
    public ListNode removeNodes(ListNode head) {
        ListNode l = head;
        while (l != null && l.next != null){
            if (l.next.val > l.val) l.val = 0;
            l = l.next;
        }

        return head;
    }
}
