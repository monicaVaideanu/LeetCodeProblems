import java.util.ArrayList;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode it = head;
        ArrayList<Integer> values = new ArrayList<>();
        while (it.next != null) {
            values.add(it.val);
            it = it.next;
        }
        values.add(it.val);
        it = head;
        int counter = values.size() - 1;
        while (it != null && counter >= 0) {
            it.val = values.get(counter);
            counter--;
            it = it.next;
        }
        return head;
    }
}
