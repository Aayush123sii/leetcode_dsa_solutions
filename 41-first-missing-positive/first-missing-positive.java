class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n= nums.length;
        int i=0;
        while(i<n){
            if  (nums[i]<=0 || nums[i]> n || nums[i]==i+1 || nums[nums[i]-1]==nums[i]){ 
            i++;
            }
            else{
                int rightidx=nums[i]-1;
             int temp=nums[i];
             nums[i]=nums[rightidx];
             nums[rightidx]=temp;
            }
        }
        for (int j=0;j<n;j++){
            if(nums[j]!=j+1) {
                return j+1;
               
            }
        }
       return n+1;
    }}