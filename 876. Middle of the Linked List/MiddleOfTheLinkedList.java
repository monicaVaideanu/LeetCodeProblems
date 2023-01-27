/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode it = head;
        int counter = 0;
        while (it.next != null) {
            counter++;
            it = it.next;
        }
        if (counter % 2 != 0) {
            for (int i = 0; i <= counter / 2; i++) {
                head = head.next;
            }
        } else {
            for (int i = 0; i < counter / 2; i++) {
                head = head.next;
            }
        }

        return head;
    }
}
