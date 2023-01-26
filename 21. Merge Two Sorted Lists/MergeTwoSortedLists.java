/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode it1 = list1;
        ListNode it2 = list2;
        ListNode list3 = new ListNode();
        ListNode prev = list3;
        while (it1 != null && it2 != null) {
            if (it1.val <= it2.val) {
                prev.next = it1;
                it1 = it1.next;
            } else {
                prev.next = it2;
                it2 = it2.next;
            }
            prev = prev.next;
        }
        if (it1 == null) {
            prev.next = it2;
        }
        if (it2 == null) {
            prev.next = it1;
        }
        return list3.next;
    }
}
