public class RemoveDuplicatesFromSortedList_83 {

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;

        while (res != null && res.next != null) {
            if (res.val == res.next.val) {
                res.next = res.next.next;
                continue;
            }
            res = res.next;
        }
        return head;
    }
}
