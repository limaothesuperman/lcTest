/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
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

public class MiddleOfTheLinkedList_876 {
    public ListNode middleNode(ListNode head) {
        int count = 1;
        ListNode res = head;

        while (head != null && head.next != null) {
            count++;
            head = head.next;
        }
        int mid = count / 2;

        while (mid >= 0 && res.next != null) {
            if (mid == 0) return res;
            res = res.next;
            mid--;
        }
        return res;
    }
}
