package pers.gxy.leetcode.n2;

/**
 * <h1><a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a></h1>
 * <div>
 * <p>
 * You are given two <b>non-empty</b> linked lists representing two non-negative
 * integers. The digits are stored in <b>reverse order</b> and each of their
 * nodes contain a single digit. Add the two numbers and return it as a linked
 * list.
 * </p>
 * 
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * </p>
 * 
 * <p>
 * <b>Example:</b>
 * </p>
 * 
 * <pre>
 * <b>Input:</b> (2 -&gt; 4 -&gt; 3) + (5 -&gt; 6 -&gt; 4)
* <b>Output:</b> 7 -&gt; 0 -&gt; 8
* <b>Explanation:</b> 342 + 465 = 807.
 * </pre>
 * 
 * </div>
 * 
 * @author gaoxiuya
 *
 */
public class Solution {
    /**
     * <p>
     *  
     * runtime : 21ms
     * </p>
     * 
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode proint = head;
        int jinwei = 0;
        int num = 0;
        while (l1 != null || l2 != null) {
            int i = 0;
            int j = 0;
            if (l1 != null) {
                i = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                j = l2.val;
                l2 = l2.next;
            }
            num = i + j + jinwei;
            jinwei = num / 10;
            num = num % 10;
            proint.next = new ListNode(num);
            proint = proint.next;
        }
        if (jinwei > 0) {
            proint.next = new ListNode(jinwei);
        }
        return head.next;
    }
}
