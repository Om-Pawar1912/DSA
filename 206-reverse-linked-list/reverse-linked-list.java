
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        // method 1

        ListNode a = head;
        ListNode b = a.next; 
        a.next = null;
       ListNode c= reverseList(b);

        b.next = a;

        return c;






    //    method 2

        // ListNode pre = null;
        // ListNode current = head;
        // ListNode forward = null;

        // while(current!=null){
        //     forward = current.next;
        //     current.next = pre;
        //     pre = current;
        //     current = forward;


        // }
        
        // return pre;



        
    }
}