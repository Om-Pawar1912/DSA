
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode pre = null;
        ListNode current = head;
        ListNode forward = null;

        while(current!=null){
            forward = current.next;
            current.next = pre;
            pre = current;
            current = forward;


        }
        
        return pre;



        
    }
}