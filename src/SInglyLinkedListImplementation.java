public class SInglyLinkedListImplementation {
    private ListNode head;

    static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }


        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }


    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }


    public static int count(SInglyLinkedListImplementation listNode){

        ListNode current = listNode.getHead();
        int count = 0;
        while (current != null){
            current = current.getNext();
            count++;
        }

        return count;
    }
}



