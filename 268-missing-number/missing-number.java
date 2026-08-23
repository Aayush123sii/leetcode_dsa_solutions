class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int i = 0;

        while (i < nums.length) {
            int idx = nums[i];

            // Put nums[i] at its correct index.
            // n cannot be placed because array indices only go 0..n-1.
            if (idx < n && nums[i] != nums[idx]) {
                swap(nums, i, idx);
            } else {
                i++;
            }
        }

        // After placement, index i should contain i.
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        // If all 0..n-1 are present, n is missing.
        return n;
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
