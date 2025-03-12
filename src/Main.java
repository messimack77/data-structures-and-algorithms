
public class Main {
    public static void main(String[] args) {
              SInglyLinkedListImplementation singlyLinkedList = new SInglyLinkedListImplementation();
              singlyLinkedList.setHead(new SInglyLinkedListImplementation.ListNode(10));
             SInglyLinkedListImplementation.ListNode second = new SInglyLinkedListImplementation.ListNode(20);
             SInglyLinkedListImplementation.ListNode third = new SInglyLinkedListImplementation.ListNode(30);
             SInglyLinkedListImplementation.ListNode fourth = new SInglyLinkedListImplementation.ListNode(40);
             SInglyLinkedListImplementation.ListNode fifth = new SInglyLinkedListImplementation.ListNode(50);

             singlyLinkedList.getHead().setNext(second);
             second.setNext(third);
             third.setNext(fourth);

    }
}
