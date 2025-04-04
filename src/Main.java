import java.util.List;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.insertAtTheBeginning(2);
        ssl.insertAtTheBeginning(1);
        ssl.insertToTheEnd(2);
        ssl.insertAtTheBeginning(0);
        ssl.insertToTheEnd(3);
        ssl.insertToTheEnd(4);
        ssl.insertToTheEnd(100);

        ssl.deleteNodeFromTheGivenPosition(3);
        System.out.println("Middle node: "+ssl.findTheMiddleNode().data);

        ssl.display(ssl.head);
        System.out.println("The fourth node is "+ ssl.findTheNthNodeInTheList(4).data);

//        System.out.println("New N th node"+ssl.findTheNthNodeFromTheList(4).data);

        System.out.println("nth node from the end "+ssl.findTheNthNodeFromTheEnd(4).data);



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

        public void display(ListNode head) {
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


        public boolean searchForNode(int target){
            ListNode current = head;
            while (current != null){
                if (current.data == target){
                    return true;
                }
                current = current.next;

            }
            return false;
        }


        public ListNode reverseNode(ListNode head){
            //   null-> 1-> 2-> 3-> 4-> 5
           if (head == null){
            return null;
           }
           ListNode current = head;
           ListNode previous = null;
           ListNode next = null;

           while (current != null){
               next = current.next; //store the next node
               current.next = previous; //reverse the link
               previous = current; //move the previous pointer to current
               current = next; //move to the next node
           }
           return previous;
        }
        public ListNode findTheMiddleNode(){
            if (head == null){
                return null;
            }
            ListNode fastPointer = head;
            ListNode slowPointer = head;
            while (fastPointer != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
            return slowPointer;
        }

        public ListNode findTheNthNodeInTheList(int n){
            ListNode current = head;
            ListNode previous = null;
            int count = 1;
            while (count < n){
                current = current.next;
                previous = current;
                count++;
            }
            return previous;
        }

        public ListNode findTheSecondLastNodeFromTheList() {
            ListNode current = head;
            ListNode previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;

            }
            return previous;
        }


        public ListNode findTheNthNodeFromTheEnd(int n){
          ListNode fastPointer = head;
          ListNode slowPointer = head;
          int count = 0;

            // This loop is used to create n gap between main pointer and reference pointer
          while (count < n){
              fastPointer = fastPointer.next;
              count++;
          }

            // As the above loop created n gap for us, when the fast pointer reaches the null,
            // the slow pointer will be exactly at the n node from the end
          while (fastPointer != null){
              slowPointer = slowPointer.next;
              fastPointer = fastPointer.next;
          }

          return slowPointer;
        }
    }
}
