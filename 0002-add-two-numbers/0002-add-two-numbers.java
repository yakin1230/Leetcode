/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode res = new ListNode();
        ListNode t = res;
        int carry = 0;

        while (t1 != null && t2 != null) {
            int a = t1.val;
            int b = t2.val;
            int sum = a + b + carry;
            carry = sum / 10;
            t.next = new ListNode(sum % 10);
            t = t.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        while (t1 != null) {
            int val = t1.val;
            int sum = val + carry;
            carry = sum / 10;
            t.next = new ListNode(sum % 10);
            t = t.next;
            t1 = t1.next;
        }
        while (t2 != null) {
            int val = t2.val;
            int sum = val + carry;
            carry = sum / 10;
            t.next = new ListNode(sum % 10);
            t = t.next;
            t2 = t2.next;
        }
        if (carry == 1) {
            t.next = new ListNode(1);
            t = t.next;
        }
        return res.next;
    }
}