class Solution {
    public int[] twoSum(int[] arr, int target) {
        

        if(arr.length ==2){
             if(arr[0]+arr[1]==target){
             return new int[]{0,1};

        }
        }
       // USE TWO POINTER APPROACH
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                   return new int[]{i,j};
                    }
            }
        }
        return new int[]{};
        
        
    }
}