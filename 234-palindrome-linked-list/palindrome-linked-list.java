
class Solution {
    public boolean isPalindrome(ListNode head) {

       ListNode temp = head;

       ArrayList<Integer> arr = new ArrayList<>();

       for(temp = head; temp!=null; temp = temp.next){
        arr.add(temp.val);
       }

       boolean ans = true;

       int x = 0;
       int y = arr.size()-1;
       while(x<y){
        if(arr.get(x)!=arr.get(y))
        {
            ans = false;
            return ans;
        }
        x++;
        y--;
       }


        return ans;
    }
}