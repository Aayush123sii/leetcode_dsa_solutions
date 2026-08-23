class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int n =nums.length+1;
        while(i<nums.length){
            if(nums[i]==i+1) i++;
            else{
                int idx=nums[i]-1;
                int temp =nums[i];
                if(nums[i]== nums[idx]) return nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;

            }
        }
        return 0;
    }
}