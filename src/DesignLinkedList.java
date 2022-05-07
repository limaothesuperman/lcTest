public class DesignLinkedList {

    public static class ListNode {
        ListNode next;
        int val;

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

    int size;
    ListNode head;

    public void MyLinkedList() {
        size = 0;
        head = new ListNode(0);

    }

    public int get(int index) {
        if (index < 0)
            return -1;
        else if (index >= size)
            return -1;
        ListNode curNode = head;
        for (int i = 0; i <= index; i++)
            curNode = curNode.next;
        return curNode.val;


    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size)
            return;
        if (index < 0)
            index = 0;
        size++;
        ListNode preNode = head;
        for (int i = 0; i < index; i++)
            preNode = preNode.next;
        ListNode addNode = new ListNode(val);
        addNode.next = preNode.next;
        preNode.next = addNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0)
            return;
        else if (index >= size)
            return;
        size--;
        ListNode preNode = head;
        for (int i = 0; i < index; i++)
            preNode = preNode.next;
        preNode.next = preNode.next.next;


    }
}

