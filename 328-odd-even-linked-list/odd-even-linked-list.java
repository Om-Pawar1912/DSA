class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode d1 = dummy1;
        ListNode d2 = dummy2;

        ListNode k = head;

        while (k != null) {

            // Odd position
            d1.next = k;
            d1 = d1.next;

            k = k.next;

            if (k != null) {

                // Even position
                d2.next = k;
                d2 = d2.next;

                k = k.next;
            }
        }

        // End the even list
        d2.next = null;

        // Connect odd list with even list
        d1.next = dummy2.next;

        return dummy1.next;
    }
}