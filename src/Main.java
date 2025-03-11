import java.util.Stack;

public class Main {
    public static void main(String[] args) {
 RepresentSinglyLinkedList linkedList = new RepresentSinglyLinkedList();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtBeginning(5);
        linkedList.traverse();
        linkedList.deleteNode(10);
        linkedList.traverse();
    }
}
