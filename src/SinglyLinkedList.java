public class SinglyLinkedList {
    ListNode head;


    private static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }



    public ListNode addTwoListNodes(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while (a != null || b != null){
            int x = a != null ? a.val : 0;
            int y = b != null ? b.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if (a != null) a = a.next;
            if (b != null) b = b.next;

        } if (carry > 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
