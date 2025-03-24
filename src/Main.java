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
        ssl.insertNodeAtAGivenPosition(100, 4);
        ssl.insertNodeAtAGivenPosition(100, 23);
        ssl.insertDataAtTheGivenPosition(3, 99);

        ssl.display();

    }

    public static class SinglyLinkedList{
        private ListNode head;


        public static class ListNode{
            private int data;
            private ListNode next;


            public ListNode(int data){
                this.data = data;
                this.next = null;
            }
        }

        public void display(){
            ListNode current = head;
            while (current != null){
                System.out.println(current.data + "-->");
                current = current.next;
            }
            System.out.println("null");
        }


        public void insertAtTheBeginning(int data){
            ListNode newNode = new ListNode(data);
            if (head == null){ //If the node is empty, the new node should be head
                head = newNode;
            } else { // the new node's the next pointer should be our head
                newNode.next = head;
                head = newNode;// the new node should be head
            }
        }

        public void insertNodeAtAGivenPosition(int insertAfter, int dataToBeInserted){
            ListNode newNode = new ListNode(dataToBeInserted);
            ListNode current = head;
            while (current != null){
                if(current.data == insertAfter){
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
    }
}
