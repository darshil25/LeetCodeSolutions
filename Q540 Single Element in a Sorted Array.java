class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }
        else{
        for(int i=0; i<n; i=i+2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        }
        return -1;
    }
}
