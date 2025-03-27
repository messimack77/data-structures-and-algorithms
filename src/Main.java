import java.util.List;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.insertAtTheBeginning(2);
        ssl.insertAtTheBeginning(1);
        ssl.insertToTheEnd(3);
        ssl.insertAtTheBeginning(0);
        ssl.insertToTheEnd(6);
        ssl.insertToTheEnd(100);

        ssl.deleteNodeFromTheGivenPosition(3);
        ssl.display();

    }

    public static class SinglyLinkedList {
        private ListNode head;


        public static class ListNode {
            private int data;
            private ListNode next;


            public ListNode(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void display() {
            ListNode current = head;
            while (current != null) {
                System.out.println(current.data + "-->");
                current = current.next;
            }
            System.out.println("null");
        }


        public void insertAtTheBeginning(int data) {
            ListNode newNode = new ListNode(data);
            if (head == null) { //If the node is empty, the new node should be head
                head = newNode;
            } else { // the new node's the next pointer should be our head
                newNode.next = head;
                head = newNode;// the new node should be head
            }
        }

        public void insertNodeAtAGivenPosition(int insertAfter, int dataToBeInserted) {
            ListNode newNode = new ListNode(dataToBeInserted);
            ListNode current = head;
            while (current != null) {
                if (current.data == insertAfter) {
                    newNode.next = current.next;
                    current.next = newNode;
                }
                current = current.next;
            }
        }


        public void insertDataAtTheGivenPosition(int position, int data) {


            ListNode previous = head;

            ListNode newNode = new ListNode(data);
            if (position == 1) {
                newNode.next = head;
                head = newNode;
            } else {
                int count = 1;
                while (count < position - 1) {
                    previous = previous.next;
                    count++;
                }
                ListNode current = previous.next;
                newNode.next = current;
                previous.next = newNode;
            }
        }

        public void insertToTheEnd(int data) {
            ListNode newNode = new ListNode(data);
            ListNode current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

        public void deleteTheFirstNode(){
            if (head == null){
                return;
            }
            head = head.next;
        }


        public ListNode deleteFromTheEnd(){
            //if head is null, it means the list is empty, we return null
            if (head == null){
                return null;
            }

            //if the head node has no next, there is only one node
            if (head.next == null){
                return head;
            }
            ListNode current = head;
            // This should be traversed to the second last node.
            //then we break the link between the last node and null and then point the second last node to null
            ListNode previous = null;
            while (current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;
        }

        public void deleteNodeFromTheGivenPosition(int position){

            if (position == 1){
                head = head.next;
            } else {
                ListNode previous = head;
                int count = 1;
                while (count < position - 1){
                    previous = previous.next;
                    count++;
                }

                ListNode nodeToBeDeleted = previous.next;
                previous.next = nodeToBeDeleted.next;
            }
        }
    }
}
