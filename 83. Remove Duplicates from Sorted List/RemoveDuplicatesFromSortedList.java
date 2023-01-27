/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode it = head;
        if (it == null) {
            return null;
        }
        while (it.next != null) {
            if (it.val == it.next.val) {
                it.next = it.next.next;
            } else {
                it = it.next;
            }

        }
        return head;
    }
}
