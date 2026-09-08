class Solution {
    public int missingNumber(int[] nums) {

        int Missing = 0;

        int b = nums.length; 

        int a = 0;
        int c = b*(b+1)/2;



        for(int i =0; i<nums.length; i++){
            a = a+ nums[i];
        }

        return c-a;


        
    }
}