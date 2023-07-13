class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int esum = (n * (n+1)) / 2;
        int asum = 0;
        for(int i=0; i<n; i++){
            asum = asum + nums[i];
        }
        return (esum-asum);
    }
}
