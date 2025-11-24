public class SinglyLinkedList {
    ListNode head;


    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }




        public ListNode addTwoNumbers(ListNode l1, ListNode l2){
//            123,
//            456
//               975


            ListNode dummyHead = new ListNode(0);
            ListNode current = dummyHead;
            int carry = 0;


            while (l1 != null || l2 != null){
                int l1Val = l1 != null ? l1.val : 0;
                int l2Val = l2 != null ? l2.val : 0;
                int sum = carry + l1Val + l2Val;
                carry = sum / 10;
                int nextDigit = sum % 10;
                current.next = new ListNode(nextDigit);
                current = current.next;

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }
            if (carry > 0){
                current.next = new ListNode(carry);
            }

            return dummyHead.next;
        }

    }


}
