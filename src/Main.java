public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
//        ssl.insertAtTheBeginning(8);
//        ssl.insertAtTheBeginning(7);
//        ssl.insertAtTheBeginning(6);
//        ssl.insertAtTheBeginning(4);
//        ssl.insertAtTheBeginning(3);
//        ssl.insertAtTheBeginning(2);
//        ssl.insertAtTheBeginning(1);
//        ssl.insertToTheEnd(2);
//        ssl.insertAtTheBeginning(0);
//        ssl.insertToTheEnd(3);
//        ssl.insertToTheEnd(3);
//        ssl.insertToTheEnd(4);
//        ssl.insertToTheEnd(100);
//        ssl.insertToTheEnd(100);
//
//        ssl.removeTheGivenKey(100);
//        ssl.display(ssl.head);
        ssl.insertAtTheBeginning(2);
        ssl.insertAtTheBeginning(1);
//        1,2]

        ssl.removeNthFromEnd(ssl.head,2);
        ssl.display(ssl.head);


//        ssl.deleteNodeFromTheGivenPosition(4);
//        System.out.println("Middle node: "+ssl.findTheMiddleNode().data);
//
//        ssl.display(ssl.head);
//        System.out.println("The fourth node is "+ ssl.findTheNthNodeInTheList(4).data);

//        System.out.println("New N th node"+ssl.findTheNthNodeFromTheList(4).data);

//        System.out.println("nth node from the end "+ssl.findTheNthNodeFromTheEnd(4).data);

//        SinglyLinkedList.ListNode listNode = ssl.removeDuplicatesFromSortedLinkedList(ssl.head);
//        System.out.println("***************");
//        ssl.display(listNode);


//        System.out.println("Insert to sorted");
//        ssl.insertNodeToSortedLinkedList(5);
//        ssl.display(ssl.head);
//
//
//        System.out.println("Delete from sorted by key");
//
//        ssl.removeTheGivenKey(3);
//
//        ssl.display(ssl.head);
//
//        System.out.println(ssl.detectIfTheListHasLoop());


//        SinglyLinkedList ssl = new SinglyLinkedList();
//        ssl.createLoop();
//        System.out.println(ssl.detectIfTheListHasLoop());


//        int[] numbers = {1,8,30,4,7,6};
//        int[] theMaximumOfTheSlidingWindow = ssl.findTheMaximumOfTheSlidingWindow(numbers);
//        System.out.println(Arrays.toString(theMaximumOfTheSlidingWindow));
    }

    public static class SinglyLinkedList {
        private ListNode head;


        public static class ListNode {
            private final int data;
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
          ListNode slowPointer = head;
          ListNode fastPointer = head;
          int count = 0;

          while (count < n){
              fastPointer = fastPointer.next;
              count++;
          }

          while (fastPointer != null){
              slowPointer = slowPointer.next;
              fastPointer = fastPointer.next;
          }
          return slowPointer;
        }

        // Remove duplicates from sorted linked list
        public ListNode removeDuplicatesFromSortedLinkedList(ListNode head) {
           ListNode current = head;
           while (current != null && current.next != null){
               if (current.data == current.next.data){
                   current.next = current.next.next;
               } else {
                   current = current.next;
               }
           }
           return head;
        }


        public void insertNodeToSortedLinkedList(int data){
            // 1,2,3,4,6,7,8        insert 5
            ListNode newNode = new ListNode(data);
            ListNode previous = null;
            ListNode current = head;

            while (current != null && current.data < newNode.data){ // Traverse the list while the current node is not null and its data is less than the new node's data
                previous = current;
                current = current.next;
            }
            // after getting the first data that is greater than the new node's data, we point the new node's next to current
            //then point the previous next to the new node
            newNode.next = current;
            previous.next = newNode;
        }


        public void removeTheGivenKey(int key){
            ListNode current = head;
            ListNode previous = null;
            while (current != null && current.data < key){
                previous = current;
                current = current.next;

                if (current.data == key){
                    previous.next = current.next;
                }

            }

            previous.next = current.next;
        }



        public void createLoop(){

            ListNode first = new ListNode(1);
            ListNode second = new ListNode(2);
            ListNode third = new ListNode(3);
            ListNode fourth = new ListNode(4);
            ListNode fifth = new ListNode(5);
            ListNode sixth = new ListNode(6);

            head = first;
            first.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = sixth;
            sixth.next = third;
        }

        public boolean detectIfTheListHasLoop(){
            ListNode slowPointer = head;
            ListNode fastPointer = head;

            while (fastPointer != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
                if (slowPointer == fastPointer){
                    return true;
                }
            }

            return false;
        }

        public int[] findTheMaximumOfTheSlidingWindow(int[] numbers){

//            1,8,3,4,9,6
            int maxSum = 0;
            int sum = 0;
            int i = 0;
            int j;
            int k;

            int maxI = 0;
            int maxJ = 0;
            int maxK = 0;

            while (i <= numbers.length - 3){
                j = i + 1;
                k = i + 2;

                sum = numbers[i] + numbers[j] + numbers[k];
                if (sum > maxSum){
                    maxSum = sum;
                    maxI = i;
                    maxJ = j;
                    maxK = k;
                }
                i++;
            }
            System.out.println(maxSum);
            return new int[]{maxI,maxJ,maxK};
        }


        public void removeNthFromEnd(ListNode head, int n) {
            ListNode slowPointer = head;
            ListNode fastPointer = head;
            ListNode previous = head;



            if(head.next == null){
                head = null;
            }

            int count = 1;
            while(count < n){
                fastPointer = fastPointer.next;
                count++;
            }

            while(fastPointer != null){
                previous = slowPointer;
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }

            previous.next = slowPointer.next;

        }

        public ListNode findTheStartOfTheLoop(){
            ListNode fastPointer = head;
            ListNode slowPointer = head;
            ListNode temp = null;

            while (fastPointer != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;

                if (slowPointer == fastPointer){
                    temp = head;
                    while (temp != slowPointer){
                        temp = temp.next;
                        slowPointer = slowPointer.next;
                    }
                }
            }
            return temp;
        }
    }
}
