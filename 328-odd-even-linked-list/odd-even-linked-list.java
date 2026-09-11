class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        

        ListNode t1 = dummy1;
        ListNode t2 = dummy2;

        ListNode t = head;

        while(t!=null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
            t2 = t2.next;
            if(t!=null) t = t.next;
        }

       t1.next = dummy2.next;

        return dummy1.next;



        



    }
}