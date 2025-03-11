import java.util.NoSuchElementException;

public class RepresentSinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Delete a node by value
    public void deleteNode(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.next.data == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void traverse() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}