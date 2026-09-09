class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-2);
        ListNode t = dummy1;
        ListNode l = dummy2;

        ListNode k = head;

        while(k!=null){
            if(k.val<x){
                t.next = k;
                
                t = t.next;
            }
            else{
                if(k.val>=x){
                    l.next = k;
                    l = l.next;

                }
                
            }
            k = k.next;
        }

        l.next = null;
        t.next = dummy2.next;


        

        
        return dummy1.next;
        
    }
}