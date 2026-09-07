/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
    return head;
}

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode a = slow.next;
        slow.next = null;

        ListNode x = sortList(head);
        ListNode y = sortList(a);

        ListNode dummy = new ListNode(-1);

        ListNode d = dummy;

        ListNode i = x;
        ListNode j = y;

        while(i!=null && j!=null){
            if(i.val<j.val){
                d.next = i;
                i = i.next;
            }
            else{
                d.next = j;
                j= j.next;
            }
             d= d.next;
        }

        if(i==null) d.next = j;
        else d.next = i;

        return dummy.next;







        
    }
}