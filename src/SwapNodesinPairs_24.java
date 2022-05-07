import java.util.LinkedList;

public class SwapNodesinPairs_24 {
    public class ListNode {
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

    public static void testCase() {

    }

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curNode = dummy;

        while (curNode.next != null && curNode.next.next != null) {
            ListNode temp1 = curNode.next;
            ListNode temp2 = curNode.next.next.next;

            curNode.next = curNode.next.next;
            curNode.next.next = temp1;
            curNode.next.next.next = temp2;
            curNode = curNode.next.next;


        }
        return dummy.next;
    }

}
