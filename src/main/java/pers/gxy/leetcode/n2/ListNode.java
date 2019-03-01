package pers.gxy.leetcode.n2;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode array2ListNode(int[] a) {
        ListNode head = new ListNode(0);
        ListNode l1 = head;
        for (int i = 0; i < a.length; i++) {
            l1.next = new ListNode(a[i]);
            l1 = l1.next;
        }
        return head.next;
    }
}