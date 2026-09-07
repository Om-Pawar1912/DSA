class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];

        int a = 1;
        

        int x = nums.length/2;
         
         

        for(int i = 0; i<nums.length-1; i++){
            a=1;
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    a++;
                    if(a>x) return nums[i];
                   
                }

               
            }
        }
        return -1;
        
    }
}