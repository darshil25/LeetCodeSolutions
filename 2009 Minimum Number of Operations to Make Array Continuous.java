class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int j=1;
        int duplicate = 0;

        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            while(j < nums.length && nums[j] <= nums[i]+nums.length-1){
                if(nums[j] == nums[j-1]){
                    duplicate++;
                }
                arr[j] = duplicate;
                j++;
            }
            min = Math.min(min, i+(nums.length-j) + duplicate-arr[i]);
        }
        return min;
    }
}
