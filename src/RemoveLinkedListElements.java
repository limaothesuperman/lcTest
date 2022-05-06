import java.util.LinkedList;

public class RemoveLinkedListElements {
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
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(6);

        System.out.println(list);
    }

    public  ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else
                pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
