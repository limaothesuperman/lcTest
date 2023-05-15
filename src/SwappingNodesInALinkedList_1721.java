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
public class SwappingNodesInALinkedList_1721 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;

        while (left != null && k != 1) {
            left = left.next;
            k--;
        }

        ListNode cur = left;

        while (cur.next != null) {
            cur = cur.next;
            right = right.next;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}
