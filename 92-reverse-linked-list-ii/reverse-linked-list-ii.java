class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode before = dummy;

        // Move before to the node just before left
        for (int i = 1; i < left; i++) {
            before = before.next;
        }

        // Start of the part to reverse
        ListNode current = before.next;

        // Reverse between left and right
        for (int i = 0; i < right - left; i++) {

            ListNode forward = current.next;

            current.next = forward.next;
            forward.next = before.next;
            before.next = forward;
        }

        return dummy.next;
    }
}