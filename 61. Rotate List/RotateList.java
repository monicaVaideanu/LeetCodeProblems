/**
 * https://leetcode.com/problems/rotate-list/
 * Given the head of a linked list, rotate the list to the right by k places.
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//Given the head of a linked list, rotate the list to the right by k places.
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) {
            return head;
        }
        int length = length(head);
        k = k % length;
        for (int i = 0; i < k; i++) {
            ListNode last = head;
            ListNode secondLast = head;
            while (last.next != null) {
                secondLast = last;
                last = last.next;

            }
            last.next = head;
            secondLast.next = null;
            head = last;
        }
        return head;
    }

    public int length(ListNode head) {
        ListNode it = head;
        int length = 0;
        while (it != null) {
            it = it.next;
            length++;
        }
        return length;
    }
}
