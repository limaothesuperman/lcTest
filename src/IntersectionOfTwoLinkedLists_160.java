public class IntersectionOfTwoLinkedLists_160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) return null;

        ListNode curNodeA = headA;
        ListNode curNodeB = headB;
        while (curNodeA != curNodeB) {
            if (curNodeA == null) {
                curNodeA = headB;
            } else
                curNodeA = curNodeA.next;

            if (curNodeB == null) {
                curNodeB = headA;
            } else
                curNodeB = curNodeB.next;

            // curNodeA = curNodeA == null ? headB : curNodeA.next;
            // curNodeB = curNodeB == null ? headA : curNodeB.next;

        }
        return curNodeB;

    }
}
