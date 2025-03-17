import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static class SinglyLinkedList{
        private ListNode head;

        private static class ListNode{
            private int data;
            private ListNode next;


            public ListNode(int data){
                this.data = data;
                this.next = null;
            }
        }




        public void insertToTheEnd(int data){
            ListNode newListNode = new ListNode(data);
            //if head is null, this means the singly linked list is empty.
            // Then head is the new list node
            if (head == null){
                head = newListNode;
            }

            //we need to move to end node to get the last node
            // (we know that the last node points to null)
            ListNode current = head;
            while (current.next != null){
                current = current.next;
            }
            //after we get the last node that points to null,
            //we can point the current's node next to the new node
            current.next = newListNode;
        }
    }
}
