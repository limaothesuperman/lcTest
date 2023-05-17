import java.util.ArrayList;
import java.util.List;

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

public class MaximumTwinSumOfALinkedList_2130 {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int start = 0;
        int end = list.size() - 1;
        int res = 0;
        while (start < end) {
            res = Math.max(res, list.get(start) + list.get(end));
            start++;
            end--;
        }
        return res;

    }
}

